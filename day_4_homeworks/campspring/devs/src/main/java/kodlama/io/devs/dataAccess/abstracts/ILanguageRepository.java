package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ILanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage language);

    void delete(ProgrammingLanguage language);

    ProgrammingLanguage get(String languageName);

    ProgrammingLanguage get(int languageId);

    void update(String oldName, String newName);
}
