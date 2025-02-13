package application.aicomic.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.aicomic.dataAccess.GenresDTO;
import application.aicomic.models.Genres;
import application.aicomic.services.GenresService;

@RequestMapping("/genre")
@RestController
public class GenresController {
    private GenresService genresService;

    @GetMapping
    public List<Genres> getAllGenres() {
        return genresService.getAllGenres();
    }

    @PostMapping
    public Genres addGenre(@RequestBody Genres genres) {
        return genresService.addGenre(genres);
    }

    @PutMapping("/{update}")
    public Genres updateGenre(@PathVariable String id, @RequestBody GenresDTO genresDTO) {
        return genresService.updateGenre(id, genresDTO);
    }

    @GetMapping("/{getById}")
    public Genres getGenreById(@PathVariable String id) {
        return genresService.getGenreById(id);
    }

    @DeleteMapping("/{delete}")
    public Genres deleteGenre(@PathVariable String id) {
        return genresService.deleteGenre(id);
    }
}