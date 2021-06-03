package EFUB.commento.controller;

import EFUB.commento.domain.Question;
import EFUB.commento.dto.QuestionDto;
import EFUB.commento.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("/api/post")
    public List<Question> getAllPost(){
        return questionService.getAllPost();
    }

    @GetMapping("/api/post/{id}")
    public Question getOnePost(@PathVariable Long id){
        return questionService.getOnePost(id);
    }

    @GetMapping("/api/question")
    public List<QuestionDto> getAllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/api/question/{id}")
    public QuestionDto getOneQuestion(@PathVariable Long id){
        return questionService.getOneQuestion(id);
    }

    @GetMapping("/api/question/com")
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
