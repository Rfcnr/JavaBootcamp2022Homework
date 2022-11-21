package kodlama.io.devs2.business.concretes;

import kodlama.io.devs2.business.abstracts.IProgrammingLanguageService;
import kodlama.io.devs2.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs2.business.requests.DeleteLanguageRequest;
import kodlama.io.devs2.business.requests.RequestOfAddTechnologyToLanguage;
import kodlama.io.devs2.business.requests.UpdateLanguageNameRequest;
import kodlama.io.devs2.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs2.dataAccess.abstracts.IProgrammingLanguageRepository;
import kodlama.io.devs2.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs2.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService {

    private final IProgrammingLanguageRepository programmingLanguageRepository;
    private final RelationManager relationManager;

    @Autowired
    public ProgrammingLanguageManager(IProgrammingLanguageRepository programmingLanguageRepository, RelationManager relationManager) {
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.relationManager = relationManager;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> languages = this.programmingLanguageRepository.findAll();

        List<GetAllProgrammingLanguagesResponse> allProgrammingLanguagesResponses = new ArrayList<>();

        for(ProgrammingLanguage language : languages){
            GetAllProgrammingLanguagesResponse response = new GetAllProgrammingLanguagesResponse();
            response.setLanguageId(language.getId());
            response.setLanguageName(language.getName());
            response.setSubTechnologiesOfLanguage(language.getSubTechnologies());
            allProgrammingLanguagesResponses.add(response);
        }
        return allProgrammingLanguagesResponses;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createRequest){

        String newLanguageName = createRequest.getProgrammingLanguageName().trim();

        if (isTheNameAvailable(newLanguageName) && !isTheNameAlreadyExist(newLanguageName)){
            ProgrammingLanguage language = new ProgrammingLanguage();
            language.setName(newLanguageName);
            programmingLanguageRepository.save(language);
        }
    }

    @Override
    public void addSubTechnologyToLanguage(RequestOfAddTechnologyToLanguage request) {
        ProgrammingLanguage referanceLanguage = programmingLanguageRepository.getReferenceById(request.getMainLanguageId());

        relationManager.addSubTechnologyToLanguage(referanceLanguage, request.getSubtechnologyName());
    }

    @Override
    public void delete(DeleteLanguageRequest deleteRequest) {


        int languageIdToBeDeleted = deleteRequest.getLanguageIdToBeDeleted();

        ProgrammingLanguage referanceLanguage = programmingLanguageRepository.getReferenceById(languageIdToBeDeleted);

        List<SubTechnology> technologies = referanceLanguage.getSubTechnologies();
        for (SubTechnology technology : technologies){
            relationManager.deleteSubTechnology(technology);
        }

        programmingLanguageRepository.deleteById(deleteRequest.getLanguageIdToBeDeleted());
    }

    @Override
    public void update(UpdateLanguageNameRequest request) {

        programmingLanguageRepository.findById(request.getLanguageIdToBeUpdated()).ifPresent(language -> language.setName(request.getNewLanguageName()));
        programmingLanguageRepository.findById(request.getLanguageIdToBeUpdated()).ifPresent(programmingLanguageRepository::save);
    }

    private boolean isTheNameAlreadyExist(String name){
        List<ProgrammingLanguage> languages = this.programmingLanguageRepository.findAll();
        for(ProgrammingLanguage registeredLanguage : languages){
            if(name.equalsIgnoreCase(registeredLanguage.getName())){
                return true;
            }
        }


        return false;
    }

    private boolean isTheNameAvailable(String name){
        return !name.isBlank();
    }

}
