package EFUB.commento.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QuestionDto {
    private String company;
    private String position;
    private String title;
    private String content;
}
