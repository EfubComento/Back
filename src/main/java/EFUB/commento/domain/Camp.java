package EFUB.commento.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "camp")
public class Camp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="image", nullable = false)
    private String image;

    @Column(name="category", nullable = false)
    private String category;

    @Column(name="content", nullable = false)
    private String content;
}
