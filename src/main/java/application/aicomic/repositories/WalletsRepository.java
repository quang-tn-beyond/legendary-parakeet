package application.aicomic.repositories;

import application.aicomic.models.Wallets;
import org.springframework.data.jpa.repository.JpaRepository;

import application.aicomic.models.Comics;

public interface WalletsRepository extends JpaRepository<Wallets, String> {

}
