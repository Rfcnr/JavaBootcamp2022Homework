package kodlama.io.devs2.business.responses;

import kodlama.io.devs2.entities.concretes.SubTechnology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguagesResponse {

    private int languageId;
    private String languageName;
    private List<SubTechnology> subTechnologiesOfLanguage;

}
