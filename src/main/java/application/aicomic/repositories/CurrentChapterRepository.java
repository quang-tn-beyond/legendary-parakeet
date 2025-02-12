package application.aicomic.repositories;

import application.aicomic.models.CurrentChapter;
import application.aicomic.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentChapterRepository extends JpaRepository<CurrentChapter, String> {
}
