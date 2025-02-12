package application.aicomic.repositories;

import application.aicomic.models.Comments;
import application.aicomic.models.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String> {
}
