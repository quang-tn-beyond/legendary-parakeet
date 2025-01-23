package application.aicomic.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Bookshelves")
@Data
public class Bookshelves {
    @Id
    @Column(name = "bookshelve_id", length = 50)
    private String bookshelveId;

    @NotNull
    @Column(name = "bookshelve_name", length = 50)
    private String bookshelveName;

    @Column(name = "description", length = 250)
    private String description;

    @NotNull
    @Column(name = "status")
    private byte status;

    @ManyToMany
    @JoinTable(
            name = "Bookshelves_Comics",
            joinColumns = @JoinColumn(name = "bookshelve_id"),
            inverseJoinColumns = @JoinColumn(name = "comic_id")
    )
    private List<Comics> comics;

    @ManyToMany
    @JoinTable(
            name = "Bookshelves_Users",
            joinColumns = @JoinColumn(name = "bookshelve_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<Users> user;
}
