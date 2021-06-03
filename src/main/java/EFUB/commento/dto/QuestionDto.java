package EFUB.commento.dto;

import EFUB.commento.domain.Question;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QuestionDto {
    private Long id;
    private String company;
    private String position;
    private String title;
    private String content;

    public static QuestionDto of(Question question){
        QuestionDto questionDto = new QuestionDto();
        questionDto.setId(question.getId());
        questionDto.setCompany(question.getCompany());
        questionDto.setContent(question.getContent());
        questionDto.setTitle(question.getTitle());
        questionDto.setPosition(question.getPosition());

        return questionDto;
    }
}
