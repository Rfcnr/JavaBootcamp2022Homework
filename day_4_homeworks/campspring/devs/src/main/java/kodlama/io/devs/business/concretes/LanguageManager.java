package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ILanguageService;
import kodlama.io.devs.dataAccess.abstracts.ILanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements ILanguageService {
    private ILanguageRepository languageRepository;

    @Autowired
    public LanguageManager(ILanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(ProgrammingLanguage language) {
        String name = language.getName().trim();
        if (name.isEmpty()) System.out.println("Programming language name cannot be empty.");
        else {
            boolean isValid = true;
            for (ProgrammingLanguage item : languageRepository.getAll()) {
                if (item.getName().equals(language.getName())) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) languageRepository.add(language);
            else System.out.println("Programming language cannot repeat name.");
        }
    }

    @Override
    public ProgrammingLanguage get(String languageName) {
        return languageRepository.get(languageName);
    }

    @Override
    public ProgrammingLanguage get(int languageId) {
        return languageRepository.get(languageId);
    }

    @Override
    public void delete(String languageName) {

        languageRepository.delete(get(languageName));
    }

    @Override
    public void delete(int languageId) {
        languageRepository.delete(get(languageId));
    }

    @Override
    public void update(String oldName, String newName) {
        languageRepository.update(oldName, newName);
    }
}
