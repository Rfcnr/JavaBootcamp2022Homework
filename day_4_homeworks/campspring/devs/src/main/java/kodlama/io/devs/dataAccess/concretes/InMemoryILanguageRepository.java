package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryILanguageRepository implements ILanguageRepository {
    List<ProgrammingLanguage> languages;
    int counter = 0;
    public InMemoryILanguageRepository() {
        languages = new ArrayList<>();
        languages.add(new ProgrammingLanguage(1, "Java"));
        languages.add(new ProgrammingLanguage(2, "C#"));
        languages.add(new ProgrammingLanguage(3, "Python"));
        languages.add(new ProgrammingLanguage(4, "C"));
        languages.add(new ProgrammingLanguage(5, "C++"));
        counter = languages.size();
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public void add(ProgrammingLanguage language) {
        int nextId = languages.get(languages.size()-1).getId() + 1;
        language.setId(nextId);
        languages.add(language);
    }

    @Override
    public void delete(ProgrammingLanguage language) {
        for(ProgrammingLanguage item : languages){
            if(item.getId() == language.getId()){
                System.out.println(item.getName() + " deleted.");
                languages.remove(item);
                break;
            }
        }
    }

    @Override
    public ProgrammingLanguage get(String languageName) {
        for (ProgrammingLanguage language : languages)
        {
            if(language.getName().equals(languageName)) return language;
        }
        System.out.println("Language name not found! Name: " + languageName);
        return null;
    }

    @Override
    public ProgrammingLanguage get(int languageId) {
        for (ProgrammingLanguage language : languages)
        {
            if(language.getId() == languageId) return language;
        }
        System.out.println("Language ID not found! ID: " + languageId);
        return null;
    }

    @Override
    public void update(String oldName, String newName) {
        for(ProgrammingLanguage language : languages)
        {
            if (language.getName().equals(oldName)){
                language.setName(newName);
                break;
            }
        }
    }
}
