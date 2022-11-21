package kodlama.io.devs2.dataAccess.abstracts;

import kodlama.io.devs2.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
