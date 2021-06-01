package EFUB.commento.service;

import EFUB.commento.domain.Answer;
import EFUB.commento.domain.AnswerRepository;
import EFUB.commento.domain.Question;
import EFUB.commento.dto.AnswerDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository){
        this.answerRepository=answerRepository;
    }


    public List<Answer> getAnswer(Question question){
        return answerRepository.getAnswer(question);
    }

    public void registerAnswer(AnswerDto answerDto){
        Answer answer=new Answer();
        answer.setCompany(answerDto.getCompany());
        answer.setContent(answerDto.getContent());
        answer.setQuestion(answerDto.getQuestion());

        answerRepository.save(answer);
    }

    public void deleteAnswer(Long id){
        answerRepository.deleteById(id);
    }

    public void updateAnswer(Long id, Answer newAnswer){
        Optional<Answer> originalAnswer=answerRepository.findById(id);

        originalAnswer.ifPresent(selectAnswer ->{
            selectAnswer.setCompany(newAnswer.getCompany());
            selectAnswer.setContent(newAnswer.getContent());
            selectAnswer.setQuestion(newAnswer.getQuestion());
            answerRepository.save(selectAnswer);
        });    }

}
