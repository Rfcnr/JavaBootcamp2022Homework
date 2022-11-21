package kodlama.io.devs2.business.abstracts;

import kodlama.io.devs2.business.requests.CreateSubTechnologyRequest;
import kodlama.io.devs2.business.requests.DeleteSubtechnologyRequest;
import kodlama.io.devs2.business.requests.UpdateTechnologyNameRequest;
import kodlama.io.devs2.business.responses.GetAllSubTechnologiesResponse;

import java.util.List;

public interface ISubTechnologyService {

    List<GetAllSubTechnologiesResponse> getAll();

    void add(CreateSubTechnologyRequest createSubTechnologyRequest);

    void delete(DeleteSubtechnologyRequest request);

    void update(UpdateTechnologyNameRequest request);


}
