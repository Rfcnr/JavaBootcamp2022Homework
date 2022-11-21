package kodlama.io.devs2.dataAccess.abstracts;

import kodlama.io.devs2.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubTechnologyRepository extends JpaRepository<SubTechnology, Integer> {
}
