package application.aicomic.dataAccess;

import lombok.Data;

@Data
public class OrderDetailsDTO {
    private String orderDetailId;
    private String orderId;
    private String chapterId;
    private double price;
}
