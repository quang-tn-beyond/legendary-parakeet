package application.aicomic.dataAccess;

import java.time.DateTimeException;

import lombok.Data;

@Data
public class WalletsDTO {
    private String walletId;
    private String userId;
    private double balance;
    private DateTimeException updateTime;
}
