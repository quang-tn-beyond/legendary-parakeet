package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_id", length = 50)
    private String orderId;

    @Column(name = "order_time")
    private LocalDateTime orderTime;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "order_status")
    private byte orderStatus;

    @Column(name = "type")
    private byte type;

    @NotNull
    @Column(name = "wallet_id", length = 50)
    private String walletId;

    @ManyToOne
    @JoinColumn(name = "wallet_id", referencedColumnName = "wallet_id", insertable = false, updatable = false)
    private Wallets wallets;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetails> orderDetails;

    @OneToMany(mappedBy = "orders")
    private List<Transactions> transactions;

    @OneToOne
    @JoinColumn(name = "comic_id", referencedColumnName = "comic_id")
    private Comics comics;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;
}
