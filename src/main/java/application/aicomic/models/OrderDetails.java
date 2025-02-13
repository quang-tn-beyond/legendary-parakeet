package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "OrderDetails")
@Data
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_detail_id", length = 50)
    private String orderDetailId;

    @NotNull
    @Column(name = "order_id", length = 50)
    private String orderId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
    private Orders orders;

    @NotNull
    @Column(name = "chapter_id", length = 50)
    private String chapterId;

    @ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id", insertable = false, updatable = false)
    private Chapters chapter;

    @NotNull
    @Column(name = "price")
    private double price;
}
