package application.aicomic.services;

import application.aicomic.dataAccess.CurrentChapterDTO;
import application.aicomic.enums.CurrentChapterEnums;
import application.aicomic.mapper.Mapper;
import application.aicomic.models.CurrentChapter;
import application.aicomic.repositories.CurrentChapterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurrentChapterService {
    private CurrentChapterRepository currentChapterRepository;
    private Mapper mapper;
    public List<CurrentChapter> getAllCurrentChapter() {
        return currentChapterRepository.findAll();
    }

    public CurrentChapter getCurrentChapterById(String id) {
        return currentChapterRepository.findById(id).get();
    }

    public CurrentChapter addCurrentChapter(CurrentChapter currentChapter) {
        return currentChapterRepository.save(currentChapter);
    }

    public CurrentChapter updateCurrentChapter(String id, CurrentChapterDTO currentChapterDto) {
        CurrentChapter currentChapter = currentChapterRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        mapper.updateCurrentChapter(currentChapter, currentChapterDto);
        return currentChapterRepository.save(currentChapter);
    }

    public CurrentChapter deleteCurrentChapter(String id) {
        Optional<CurrentChapter> currentChapter = currentChapterRepository.findById(id);
        if (currentChapter.isPresent()) {
            CurrentChapter x = currentChapter.get();
            x.setStatus(CurrentChapterEnums.AVAILABLE.getValue());
            return currentChapterRepository.save(x);
        }
        return null;
    }
}
