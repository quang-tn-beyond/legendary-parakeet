package application.aicomic.repositories;

import application.aicomic.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, String> {
    List<Users> findByRole(byte role);
    Optional<Users> findByEmail(String email);
}
