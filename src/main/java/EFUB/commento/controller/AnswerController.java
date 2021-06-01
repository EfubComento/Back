package EFUB.commento.controller;

import EFUB.commento.domain.Ex;
import EFUB.commento.domain.Answer;
import EFUB.commento.domain.Question;
import EFUB.commento.dto.AnswerDto;
import EFUB.commento.service.AnswerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AnswerController {
    //전체적으로 리턴값 json으로 수정
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService){
        this.answerService=answerService;
    }
    //1. 답변 전체조회 api 필요

    //2. 개별조회 api 명세에는 개별조회시 맨 뒤에 {id}로 받아와서 조회하는데 이건 request body로 question 받아오는 형태
    @GetMapping("/api/answer")
    public List<Answer> getAnswer(@RequestBody Question question){
        return answerService.getAnswer(question);
    }


    //3. API 명세에 request body 추가
    @PostMapping("/api/answer")
    public String registerAnswer(@RequestBody AnswerDto answerDto){
        answerService.registerAnswer(answerDto);

        return "Success";
    }


    @DeleteMapping("/api/answer/{id}")
    public String deleteAnswer(@PathVariable Long id){
        answerService.deleteAnswer(id);

        return "Success";
    }

    //4. api 명세에 request body 추가
    @PutMapping("/api/answer/{id}")
    public String updateAnswer(@PathVariable Long id, @RequestBody Answer answer){
        answerService.updateAnswer(id, answer);
        return "Success";
    }

}
