package kodlama.io.devs2.webApi;

import kodlama.io.devs2.business.abstracts.ISubTechnologyService;
import kodlama.io.devs2.business.requests.CreateSubTechnologyRequest;
import kodlama.io.devs2.business.requests.DeleteSubtechnologyRequest;
import kodlama.io.devs2.business.requests.UpdateTechnologyNameRequest;
import kodlama.io.devs2.business.responses.GetAllSubTechnologiesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologiesController {

    private ISubTechnologyService subTechnologyService;

    @Autowired
    public SubTechnologiesController(ISubTechnologyService subTechnologyService) {
        this.subTechnologyService = subTechnologyService;
    }

    //POST Requests
    @PostMapping("/add")
    public void add(CreateSubTechnologyRequest createRequest){
        subTechnologyService.add(createRequest);
    }

    //DELETE Requests
    @DeleteMapping("/delete")
    public void delete(DeleteSubtechnologyRequest deleteRequest){
        subTechnologyService.delete(deleteRequest);
    }

    //PUT Requests
    @PutMapping("/updatetechnologyname")
    public void update(UpdateTechnologyNameRequest request){
        subTechnologyService.update(request);
    }

    //GET Requests
    @GetMapping("/getall")
    public List<GetAllSubTechnologiesResponse> getAll(){
        return subTechnologyService.getAll();
    }

}
