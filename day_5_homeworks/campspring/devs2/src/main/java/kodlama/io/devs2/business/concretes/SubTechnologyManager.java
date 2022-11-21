package kodlama.io.devs2.business.concretes;

import kodlama.io.devs2.business.abstracts.ISubTechnologyService;
import kodlama.io.devs2.business.requests.CreateSubTechnologyRequest;
import kodlama.io.devs2.business.requests.DeleteSubtechnologyRequest;
import kodlama.io.devs2.business.requests.UpdateTechnologyNameRequest;
import kodlama.io.devs2.business.responses.GetAllSubTechnologiesResponse;
import kodlama.io.devs2.dataAccess.abstracts.ISubTechnologyRepository;
import kodlama.io.devs2.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs2.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubTechnologyManager implements ISubTechnologyService {

    private final ISubTechnologyRepository subTechnologyRepository;
    private final RelationManager relationManager;

    @Autowired
    public SubTechnologyManager(ISubTechnologyRepository subTechnologyRepository, RelationManager relationManager) {
        this.subTechnologyRepository = subTechnologyRepository;
        this.relationManager = relationManager;
    }

    @Override
    public List<GetAllSubTechnologiesResponse> getAll() {
        List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();

        List<GetAllSubTechnologiesResponse> allSubTechnologiesResponses = new ArrayList<>();

        for (SubTechnology technology : subTechnologies){
            GetAllSubTechnologiesResponse response = new GetAllSubTechnologiesResponse();

            response.setSubTechnologyId(technology.getId());
            response.setSubTechnologyName(technology.getSubTechnologyName());
            response.setMainLanguageName(technology.getMainProgrammingLanguage().getName());

            allSubTechnologiesResponses.add(response);
        }
        return allSubTechnologiesResponses;
    }

    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest){

        String newSubTechnologyName = createSubTechnologyRequest.getSubTechnologyName().trim();
        String mainProgrammingLanguageName = createSubTechnologyRequest.getMainProgrammingLanguageName().trim();

        ProgrammingLanguage referanceLanguage = relationManager.getLanguageByName(mainProgrammingLanguageName);

        if (isTheNameAvailable(newSubTechnologyName)){
            if (isTheTechnologyNameUnique(newSubTechnologyName)){
                SubTechnology subTechnology = new SubTechnology();
                subTechnology.setSubTechnologyName(newSubTechnologyName);

                if (referanceLanguage.getName() == null){
                    referanceLanguage.setName(mainProgrammingLanguageName);
                    relationManager.addNewLanguageFromSubTechnology(referanceLanguage);
                }

                subTechnology.setMainProgrammingLanguage(referanceLanguage);
                subTechnologyRepository.save(subTechnology);

                referanceLanguage.getSubTechnologies().add(subTechnology);
            }
        }
    }

    @Override
    public void delete(DeleteSubtechnologyRequest request) {
        int technologyIdToBeDeleted = request.getTechnologyIdToBeDeleted();

        SubTechnology technology = subTechnologyRepository.getReferenceById(technologyIdToBeDeleted);

        ProgrammingLanguage mainLanguage = technology.getMainProgrammingLanguage();
        for (SubTechnology subTechnology : mainLanguage.getSubTechnologies()){
            if (subTechnology.getId() == technology.getId()){
                mainLanguage.getSubTechnologies().remove(subTechnology);
                break;
            }
        }

        subTechnologyRepository.deleteById(technologyIdToBeDeleted);
    }

    @Override
    public void update(UpdateTechnologyNameRequest request) {
        subTechnologyRepository.findById(request.getSubTechnologyIdToBeUpdated()).ifPresent(technology -> technology.setSubTechnologyName(request.getNewSubTechnologyName()));
        subTechnologyRepository.findById(request.getSubTechnologyIdToBeUpdated()).ifPresent(subTechnologyRepository::save);
    }

    private boolean isTheTechnologyNameUnique(String technologyName){
        List<SubTechnology> allTechnologies = this.subTechnologyRepository.findAll();
        for (SubTechnology technology : allTechnologies){
            if (technology.getSubTechnologyName().equalsIgnoreCase(technologyName)) return false;
        }
        return true;
    }

    private boolean isTheNameAvailable(String name){
        return !name.isBlank();
    }
}
