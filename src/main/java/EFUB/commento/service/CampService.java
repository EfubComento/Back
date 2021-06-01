package EFUB.commento.service;

import EFUB.commento.domain.Camp;
import EFUB.commento.domain.CampRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CampService {

    private final CampRepository campRepository;

    public CampService(CampRepository campRepository) {
        this.campRepository = campRepository;
    }

    public Camp getBootCamp(Long id) {
        return campRepository.findOneById(id);
    }

    public void registerBootCamp(Camp camp) {
        campRepository.save(camp);
    }

    public void deleteBootCamp(Long id){
        campRepository.deleteById(id);
    }

    public void updateBootCamp(Long id, Camp newCamp) {
        Optional<Camp> originalCamp = campRepository.findById(id);

        originalCamp.ifPresent(selectCamp ->{
            selectCamp.setImage(newCamp.getImage());
            selectCamp.setCategory(newCamp.getCategory());
            selectCamp.setContent(newCamp.getContent());
            campRepository.save(selectCamp);
        });
    }


}
