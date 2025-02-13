package application.aicomic.models;

import java.util.List;

import application.aicomic.enums.CommentsEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "Genres")
@Data
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "genres_id", length = 50)
    private String genresId;

    @Column(name = "genres_name", length = 50)
    private String genresName;

    @Column(name = "genres_description", length = 250)
    private String genresDescription;

    @NotNull
    @Column(name = "status")
    private byte status = CommentsEnums.AVAILABLE.getValue();
    
    @ManyToMany
    @JoinTable(
            name = "Genres_Comics",
            joinColumns = @JoinColumn(name = "genres_id"),
            inverseJoinColumns = @JoinColumn(name = "comic_id")
    )
    private List<Comics> comics;
}
