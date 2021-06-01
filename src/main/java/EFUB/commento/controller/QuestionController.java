package EFUB.commento.controller;

import EFUB.commento.domain.Ex;
import EFUB.commento.domain.Question;
import EFUB.commento.dto.QuestionDto;
import EFUB.commento.dto.ResponseDto;
import EFUB.commento.service.QuestionService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    // - 전체적으로 return을 json 으로 변경하기
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    //1. 전체조회 api 추가

    //2. api 명세에 있는 개별조회 api 추가


    //3. 그냥 한거 - 회사 이름&직무로 질문 검색하기 api 명세에 이거 추가
    @GetMapping("/api/question")
    public List<Question> getQuestion(@RequestParam String company, String position){
        return questionService.getAllQuestionByCompany(company, position);
    }

    //4. api 명세 수정 - 생성에 request body 추가
    @PostMapping("/api/question")
    public ResponseDto registerQuestion(@RequestBody QuestionDto questionDto){
        questionService.registerQuestion(questionDto);

        return new ResponseDto("Success");
    }


    @DeleteMapping("/api/question/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);

        return "Success";
    }
    //5. 수정 api명세에 request body 추가
    @PutMapping("/api/question/{id}")
    public String updateQuestion(@PathVariable Long id, @RequestBody Question question){
        questionService.updateQuestion(id, question);

        return "Success";
    }
}
