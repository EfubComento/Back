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
    private final AnswerService answerService;

    public AnswerController(AnswerService answerService){
        this.answerService=answerService;
    }

    @GetMapping("/api/answer")
    public List<Answer> getAnswer(@RequestBody Question question){
        return answerService.getAnswer(question);
    }

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

    @PutMapping("/api/answer/{id}")
    public String updateAnswer(@PathVariable Long id, @RequestBody Answer answer){
        answerService.updateAnswer(id, answer);
        return "Success";
    }

}
