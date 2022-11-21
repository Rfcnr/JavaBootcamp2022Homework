package kodlama.io.devs2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TECHNOLOGIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubTechnology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_technology_id")
    private int id;

    @Column(name = "sub_technology_name")
    private String subTechnologyName;

    @ManyToOne
    @JoinColumn(name = "main_language_id")
    @JsonIgnore
    private ProgrammingLanguage mainProgrammingLanguage;
}
