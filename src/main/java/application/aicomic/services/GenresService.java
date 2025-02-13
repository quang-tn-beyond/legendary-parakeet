package application.aicomic.services;

import application.aicomic.dataAccess.GenresDTO;
import application.aicomic.enums.GenresEnums;
import application.aicomic.mapper.Mapper;
import application.aicomic.models.Genres;
import application.aicomic.repositories.GenresRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenresService {
    private final GenresRepository genresRepository;
    private final Mapper mapper;

    public GenresService(GenresRepository genresRepository, Mapper mapper) {
        this.genresRepository = genresRepository;
        this.mapper = mapper;
    }

    public List<Genres> getAllGenres() {
        return genresRepository.findAll();
    }

    public Genres getGenreById(String id) {
        return genresRepository.findById(id).orElseThrow(() -> new RuntimeException("Genre not found"));
    }

    public Genres addGenre(Genres genre) {
        return genresRepository.save(genre);
    }

    public Genres updateGenre(String id, GenresDTO genresDTO) {
        Genres genre = genresRepository.findById(id).orElseThrow(() -> new RuntimeException("Genre not found"));
        mapper.updateGenres(genre, genresDTO);
        return genresRepository.save(genre);
    }

    public Genres deleteGenre(String id) {
        Optional<Genres> genre = genresRepository.findById(id);
        if (genre.isPresent()) {
            Genres x = genre.get();
            x.setStatus(GenresEnums.AVAILABLE.getValue());
            return genresRepository.save(x);
        }
        return null;
    }
}