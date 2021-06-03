package EFUB.commento.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>{
    Answer findAllById(Long id);
//    List<Answer> findAllByQuestion_Id(Long id);
}
