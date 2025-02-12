package application.aicomic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import application.aicomic.models.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {

}
