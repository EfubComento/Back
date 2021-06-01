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

    //1. 부트캠프 전체조회 api 필요

    @GetMapping("/api/bootcamp/{id}")
    public Camp getBootCamp(@PathVariable Long id){
        return campService.getBootCamp(id);
    }


    //2. success message api 명세서처럼 json 값으로 만들어서 return -> response status가 아니라 message로 변
    @PostMapping("/api/bootcamp")
    public String registerQuestion(@RequestBody Camp camp){
        campService.registerBootCamp(camp);

        return "Success";
    }

    //4. 리턴값 수정
    @DeleteMapping("/api/bootcamp/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        campService.deleteBootCamp(id);

        return "Success";
    }

    //3. 수정 api 명세에 request body 추가하기경 + 마찬가지로 return 값 수정
    @PutMapping("/api/bootcamp/{id}")
    public String updateQuestion(@PathVariable Long id, @RequestBody Camp camp){
        campService.updateBootCamp(id, camp);

        return "Success";
    }
}
