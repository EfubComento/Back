package EFUB.commento.dto;

import EFUB.commento.domain.Question;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnswerDto {
    private String company;
    private String content;
    private QuestionDto questionDto;
    private Question question;

}
