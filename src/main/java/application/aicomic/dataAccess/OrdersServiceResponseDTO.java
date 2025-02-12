package application.aicomic.dataAccess;

import java.util.List;

import application.aicomic.models.Orders;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

@NoArgsConstructor

@Builder
public class OrdersServiceResponseDTO {
    private boolean succeed;
    private String message;
    private List<Orders> Orders;
}
