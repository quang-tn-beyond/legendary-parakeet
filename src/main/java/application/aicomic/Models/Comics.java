package application.aicomic.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Comics")
@Data
public class Comics {
    @Id
    @Column(name = "comic_id", length = 50)
    private String comicId;

    @NotNull
    @Column(name = "comic_name", length = 50)
    private String comicName;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @NotNull
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @NotNull
    @Column(name = "quantity_chap")
    private int quantityChap;

    @NotNull
    @Column(name = "cover_url", length = 250)
    private String coverUrl;

    @Column(name = "description", length = 250)
    private String description;

    @NotNull
    @Column(name = "status")
    private byte status;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;

    @ManyToMany(mappedBy = "comics")
    private List<Genres> genres;

    @ManyToMany(mappedBy = "comics")
    private List<Bookshelves> bookshelves;

    @OneToOne(mappedBy = "comics")
    private Orders orders;

    @OneToMany(mappedBy = "comic")
    private List<Chapters> chapters;
}
