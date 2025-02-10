package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transactions")
@Data
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "transaction_id", length = 50)
    private String transactionId;

    @Column(name = "transaction_time")
    private LocalDateTime transactionTime;

    @NotNull
    @Column(name = "amount")
    private double amount;

    @NotNull
    @Column(name = "status")
    private byte status;

    @NotNull
    @Column(name = "order_id", length = 50)
    private String orderId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    private Orders orders;

    @NotNull
    @Column(name = "wallet_id", length = 50)
    private String walletId;

    @ManyToOne
    @JoinColumn(name = "wallet_id", referencedColumnName = "wallet_id", insertable = false, updatable = false)
    private Wallets wallets;

    @NotNull
    @Column(name = "purchased_coin_id", length = 50)
    private String purchasedCoinId;

    @ManyToOne
    @JoinColumn(name = "purchased_coin_id", referencedColumnName = "purchased_coin_id", insertable = false, updatable = false)
    private PurchasedCoins purchasedCoins;
}
