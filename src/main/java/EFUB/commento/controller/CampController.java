package EFUB.commento.controller;

import EFUB.commento.domain.Camp;
import EFUB.commento.domain.Question;
import EFUB.commento.dto.QuestionDto;
import EFUB.commento.service.CampService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampController {
    private final CampService campService;

    public CampController(CampService campService) {
        this.campService = campService;
    }

    @GetMapping("/api/bootcamp")
    public List<Camp> getAllBootCamp() {
        return campService.getAllBootCamp();
    }

    @GetMapping("/api/bootcamp/{id}")
    public Camp getBootCamp(@PathVariable Long id){
        return campService.getBootCamp(id);
    }

    @PostMapping("/api/bootcamp")
    public String registerQuestion(@RequestBody Camp camp){
        campService.registerBootCamp(camp);

        return "Success";
    }

    @DeleteMapping("/api/bootcamp/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        campService.deleteBootCamp(id);

        return "Success";
    }

    @PutMapping("/api/bootcamp/{id}")
    public String updateQuestion(@PathVariable Long id, @RequestBody Camp camp){
        campService.updateBootCamp(id, camp);

        return "Success";
    }
}
