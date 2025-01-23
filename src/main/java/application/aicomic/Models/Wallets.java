package application.aicomic.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Wallets")
@Data
public class Wallets {
    @Id
    @Column(name = "wallet_id", length = 50)
    private String walletId;

    @Column(name = "balance")
    private double balance;

    @NotNull
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;

    @OneToMany(mappedBy = "wallets")
    private List<Transactions> transactions;

}
