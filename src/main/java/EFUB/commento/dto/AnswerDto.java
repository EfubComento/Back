package EFUB.commento.dto;

import EFUB.commento.domain.Question;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//answer dto 형식 바꾸기
public class AnswerDto {
    private String company;
    private String content;
    private Long questionId;

}
