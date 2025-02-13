
package application.aicomic.repositories;

import application.aicomic.models.Comics;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ComicsRepository extends JpaRepository<Comics, String> {

    Optional<Comics> findByComicName(String comicName);

    List<Comics> findByStatusIn(List<Byte> statuses);
}
