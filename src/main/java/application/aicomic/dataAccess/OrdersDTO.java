package application.aicomic.dataAccess;

import java.time.LocalDate;

import lombok.Data;

@Data
public class OrdersDTO {
    private String orderId;
    private LocalDate orderTime;
    private int quantity;
    private byte status;
    private byte type;
    private String comicId;
    private String userId;
}
