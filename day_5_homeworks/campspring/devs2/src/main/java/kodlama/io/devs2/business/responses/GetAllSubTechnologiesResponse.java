package kodlama.io.devs2.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubTechnologiesResponse {

    private int subTechnologyId;
    private String subTechnologyName;
    private String mainLanguageName;

}
