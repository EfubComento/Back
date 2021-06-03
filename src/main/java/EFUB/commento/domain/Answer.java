
package EFUB.commento.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="company", nullable = false)
    private String company;

    @Column(name="content", nullable = false)
    private String content;

    @Column(name="question_id")
    private Long question_id;

//    @ManyToOne
//    @JoinColumn(name="question_id", nullable = false)
//    private Question question;
}