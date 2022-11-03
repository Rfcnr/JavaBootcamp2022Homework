package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ILanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private ILanguageService languageService;

    @Autowired
    public LanguagesController(ILanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguage getLanguageById(int id) {
        return languageService.get(id);
    }

    @PostMapping("/addbyname")
    public void add(String name) {
        languageService.add(new ProgrammingLanguage(0, name));
    }

    @PostMapping("/delete")
    public void delete(String name) {
        languageService.delete(name);
    }

    @PostMapping("/update")
    public void update(String oldName, String newName) {
        languageService.update(oldName, newName);
    }
}
