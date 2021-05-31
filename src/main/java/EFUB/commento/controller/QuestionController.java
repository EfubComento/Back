package EFUB.commento.controller;

import EFUB.commento.domain.Ex;
import EFUB.commento.domain.Question;
import EFUB.commento.dto.QuestionDto;
import EFUB.commento.service.QuestionService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //그냥 한거 - 회사 이름&직무로 질문 검색하기
    @GetMapping("/api/question")
    public List<Question> getQuestion(@RequestParam String company, String position){
        return questionService.getAllQuestionByCompany(company, position);
    }

    @PostMapping("/api/question")
    public String registerQuestion(@RequestBody QuestionDto questionDto){
        questionService.registerQuestion(questionDto);

        return "Success";
    }

    @DeleteMapping("/api/question/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);

        return "Success";
    }

    @PutMapping("/api/question/{id}")
    public String updateQuestion(@PathVariable Long id, @RequestBody Question question){
        questionService.updateQuestion(id, question);

        return "Success";
    }
}
