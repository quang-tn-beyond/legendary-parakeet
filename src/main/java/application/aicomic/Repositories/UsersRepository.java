package application.aicomic.Repositories;

import application.aicomic.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, String> {
    List<Users> findByRole(byte role);
    Optional<Users> findByEmail(String email);
}
