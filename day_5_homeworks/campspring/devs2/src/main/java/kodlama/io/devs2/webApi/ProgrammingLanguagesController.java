package kodlama.io.devs2.webApi;

import kodlama.io.devs2.business.abstracts.IProgrammingLanguageService;
import kodlama.io.devs2.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs2.business.requests.DeleteLanguageRequest;
import kodlama.io.devs2.business.requests.RequestOfAddTechnologyToLanguage;
import kodlama.io.devs2.business.requests.UpdateLanguageNameRequest;
import kodlama.io.devs2.business.responses.GetAllProgrammingLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

    private IProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(IProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    //POST Requests
    @PostMapping("/add")
    public void add(CreateProgrammingLanguageRequest createRequest){
        this.programmingLanguageService.add(createRequest);
    }

    @PostMapping("/addtechnology")
    public void addTechnology(RequestOfAddTechnologyToLanguage request){
        this.programmingLanguageService.addSubTechnologyToLanguage(request);
    }

    //DELETE Requests
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest request){
        programmingLanguageService.delete(request);
    }

    //PUT Requests
    @PutMapping("/updatelanguagename")
    public void update(UpdateLanguageNameRequest request){
        programmingLanguageService.update(request);
    }

    // GET Requests
    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAll(){
        return programmingLanguageService.getAll();
    }

}
