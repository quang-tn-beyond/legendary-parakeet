package application.aicomic.repositories;

import application.aicomic.models.Comments;
import application.aicomic.models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, String> {
}
