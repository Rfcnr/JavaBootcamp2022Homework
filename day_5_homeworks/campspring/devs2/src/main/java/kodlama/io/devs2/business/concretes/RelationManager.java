package kodlama.io.devs2.business.concretes;

import kodlama.io.devs2.dataAccess.abstracts.IProgrammingLanguageRepository;
import kodlama.io.devs2.dataAccess.abstracts.ISubTechnologyRepository;
import kodlama.io.devs2.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs2.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationManager {

    private IProgrammingLanguageRepository programmingLanguageRepository;
    private ISubTechnologyRepository subTechnologyRepository;

    @Autowired
    public RelationManager(IProgrammingLanguageRepository programmingLanguageRepository, ISubTechnologyRepository subTechnologyRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
        this.subTechnologyRepository = subTechnologyRepository;
    }

    public void addSubTechnologyToLanguage(ProgrammingLanguage language, String subtechnologyName){
        List<SubTechnology> allTechnologies = subTechnologyRepository.findAll();

        SubTechnology referanceTechnology = null;
        for (SubTechnology technology : allTechnologies){
            if (technology.getSubTechnologyName().equalsIgnoreCase(subtechnologyName)
                    && language.getName().equalsIgnoreCase(technology.getMainProgrammingLanguage().getName())){
                referanceTechnology = technology;
                break;
            }
        }

        if (referanceTechnology == null){
            referanceTechnology = new SubTechnology();
            referanceTechnology.setSubTechnologyName(subtechnologyName);
            referanceTechnology.setMainProgrammingLanguage(language);
            subTechnologyRepository.save(referanceTechnology);
        }

        language.getSubTechnologies().add(referanceTechnology);
    }

    public ProgrammingLanguage getLanguageByName(String name){
        List<ProgrammingLanguage> allRegisteredLanguages = programmingLanguageRepository.findAll();

        for (ProgrammingLanguage language : allRegisteredLanguages){
            if (language.getName().equalsIgnoreCase(name)){
                return language;
            }
        }

        return new ProgrammingLanguage();
    }

    public void addNewLanguageFromSubTechnology(ProgrammingLanguage language){
        programmingLanguageRepository.save(language);
    }

    public void deleteSubTechnology(SubTechnology technology){
        subTechnologyRepository.delete(technology);
    }


}
