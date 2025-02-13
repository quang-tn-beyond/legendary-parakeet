package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "PurchasedCoins")
@Data
public class PurchasedCoins {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "purchased_coin_id", length = 50)
    private String purchasedCoinId;

    @NotNull
    @Column(name = "amount")
    private double amount;

    @NotNull
    @Column(name = "number_of_coin")
    private double numberOfCoin;

    @NotNull
    @Column(name = "type")
    private byte type;

    @NotNull
    @Column(name = "status")
    private byte status;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "purchase_time")
    private LocalDateTime purchaseTime;

    @Column(name = "transaction_code", length = 50)
    private String transactionCode;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;

    @OneToMany(mappedBy = "purchasedCoins")
    private List<Transactions> transactions;
}
