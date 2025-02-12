
package application.aicomic.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import application.aicomic.enums.ComicsEnums;
import application.aicomic.dataAccess.ComicsDTO;
import application.aicomic.dataAccess.ComicsServiceResponseDTO;
import application.aicomic.models.Comics;
import application.aicomic.repositories.ComicsRepository;
import application.aicomic.mapper.Mapper;

@Service
public class ComicsService {

    private final ComicsRepository comicsRepository;
    private Mapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(ComicsService.class);

    public ComicsService(ComicsRepository comicsRepository) {
        this.comicsRepository = comicsRepository;
    }

    public List<Comics> getAllComics() {
        return comicsRepository.findAll();
    }

    public Comics getComicsByName(String comicsName) {
        return comicsRepository.findByComicsName(comicsName).orElse(null);
    }

    public List<Comics> getComicsByCompletionStatus(boolean isCompleted) {
        List<Byte> statuses = isCompleted ? List.of((byte) 1) : List.of((byte) 0);
        return comicsRepository.findByStatusIn(statuses);
    }

    public Comics saveComics(Comics comics) {
        return comicsRepository.save(comics);
    }

    public ComicsServiceResponseDTO getByName(String name) {
        Optional<Comics> comicsOptional = comicsRepository.findById(name);
        if (comicsOptional.isPresent()) {
            Comics comics = comicsOptional.get();
            return new ComicsServiceResponseDTO(true, "Comics found.", Collections.singletonList(comics));
        }
        return new ComicsServiceResponseDTO(false, "No Comics found for the given Comics Name.",
                Collections.emptyList());
    }

    public Comics addComics(Comics comics) {
        return comicsRepository.save(comics);
    }

    public Comics updateComics(String id, ComicsDTO comicsDTO) {
        Comics comics = comicsRepository.findById(id).orElseThrow(() -> new RuntimeException("Comics not found"));
        mapper.updateComics(comics, comicsDTO);
        return comicsRepository.save(comics);
    }

    public Comics deleteComics(String id) {
        Optional<Comics> comics = comicsRepository.findById(id);
        if (comics.isPresent()) {
            Comics x = comics.get();
            x.setStatus(ComicsEnums.UPDATE.getValue());
            return comicsRepository.save(x);
        } else if (comics.isPresent()) {
            Comics x = comics.get();
            x.setStatus(ComicsEnums.COMPLETED.getValue());
            return comicsRepository.save(x);
        } else if (comics.isPresent()) {
            Comics x = comics.get();
            x.setStatus(ComicsEnums.STOPPED.getValue());
            return comicsRepository.save(x);
        }
        return null;
    }
}
