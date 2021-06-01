package EFUB.commento.service;

import EFUB.commento.domain.Ex;
import EFUB.commento.domain.Question;
import EFUB.commento.domain.QuestionRepository;
import EFUB.commento.dto.QuestionDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;


    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestionByCompany(String company, String position) {
        return questionRepository.findAllByCompanyAndPosition(company, position);
    }

    public void registerQuestion(QuestionDto questionDto) {
        Question question = new Question();
        question.setCompany(questionDto.getCompany());
        question.setPosition(questionDto.getPosition());
        question.setTitle(questionDto.getTitle());
        question.setContent(questionDto.getContent());

        questionRepository.save(question);
    }

    public void deleteQuestion(Long id){
        questionRepository.deleteById(id);
    }

    public void updateQuestion(Long id, Question newQuestion) {
        Optional<Question> originalQuestion = questionRepository.findById(id);

        originalQuestion.ifPresent(selectQuestion ->{
            selectQuestion.setCompany(newQuestion.getCompany());
            selectQuestion.setPosition(newQuestion.getPosition());
            selectQuestion.setTitle(newQuestion.getTitle());
            selectQuestion.setContent(newQuestion.getContent());
            questionRepository.save(selectQuestion);
        });
    }
}
