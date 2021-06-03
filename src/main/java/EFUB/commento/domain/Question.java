package EFUB.commento.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="company", nullable = false)
    private String company;

    @Column(name="position", nullable = false)
    private String position;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="question_id")
    private List<Answer> anwsers;
}
