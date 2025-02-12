
package application.aicomic.controllers;

import org.springframework.web.bind.annotation.RestController;

import application.aicomic.services.ComicsService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import application.aicomic.dataAccess.ComicsDTO;
import application.aicomic.models.Comics;
import application.aicomic.repositories.ComicsRepository;

@RestController
@RequestMapping("/comics")
public class ComicsController {
    private final ComicsService comicsService;
    private final ComicsRepository comicsRepository;

    public ComicsController(ComicsService comicsService, ComicsRepository comicsRepository) {
        this.comicsService = comicsService;
        this.comicsRepository = comicsRepository;
    }

    @GetMapping
    public List<Comics> getAllComics() {
        return comicsService.getAllComics();
    }

    @GetMapping("/{getName}")
    public Comics getComicsById(@PathVariable String comicsName) {
        return comicsService.getComicsByName(comicsName);
    }

    @GetMapping("/completed/{isCompleted}")
    public ResponseEntity<List<Comics>> getComicsByCompletionStatus(@PathVariable boolean isCompleted) {
        List<Comics> comicsList = comicsService.getComicsByCompletionStatus(isCompleted);
        return ResponseEntity.ok(comicsList);
    }

    @PostMapping("/{create}")
    public Comics createComics(@RequestBody Comics comics) {
        return comicsService.saveComics(comics);
    }

    @PutMapping("/{update}")
    public Comics updateComics(@PathVariable String id, @RequestBody ComicsDTO comicsDTO) {
        return comicsService.updateComics(id, comicsDTO);
    }

    @DeleteMapping("/{delete}")
    public Comics deleteComics(@PathVariable String id) {
        return comicsService.deleteComics(id);
    }
}
