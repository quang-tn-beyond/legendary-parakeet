package application.aicomic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.aicomic.models.Genres;

@Repository
public interface GenresRepository extends JpaRepository<Genres, String> {

}