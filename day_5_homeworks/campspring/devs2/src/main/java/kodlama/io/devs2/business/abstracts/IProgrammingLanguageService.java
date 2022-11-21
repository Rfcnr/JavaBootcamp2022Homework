package kodlama.io.devs2.business.abstracts;

import kodlama.io.devs2.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs2.business.requests.DeleteLanguageRequest;
import kodlama.io.devs2.business.requests.RequestOfAddTechnologyToLanguage;
import kodlama.io.devs2.business.requests.UpdateLanguageNameRequest;
import kodlama.io.devs2.business.responses.GetAllProgrammingLanguagesResponse;

import java.util.List;

public interface IProgrammingLanguageService {

    List<GetAllProgrammingLanguagesResponse> getAll();

    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

    void delete(DeleteLanguageRequest request);

    void update(UpdateLanguageNameRequest request);

    void addSubTechnologyToLanguage(RequestOfAddTechnologyToLanguage request);

}
