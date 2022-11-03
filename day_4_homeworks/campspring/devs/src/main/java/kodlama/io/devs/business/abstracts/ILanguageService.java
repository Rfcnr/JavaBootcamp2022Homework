package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ILanguageService {
    //business rules
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage language);

    ProgrammingLanguage get(String languageName);

    ProgrammingLanguage get(int languageId);

    void delete(String languageName);

    void delete(int languageId);

    void update(String oldName, String newName);
}
