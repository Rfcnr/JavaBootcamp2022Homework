package kodlama.io.devs2.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROGRAMMING_LANGUAGES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int id;

    @Column(name = "language_name")
    private String name;

    @OneToMany(mappedBy = "mainProgrammingLanguage")
    private List<SubTechnology> subTechnologies = new ArrayList<>();

}
