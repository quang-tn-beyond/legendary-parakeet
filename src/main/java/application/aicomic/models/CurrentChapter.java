package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "CurrentChapter")
@Data
public class CurrentChapter {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "current_chaper_id", length = 50)
    private String currentChaperId;

    @NotNull
    @Column(name = "status")
    private byte status;

    @NotNull
    @Column(name = "comic_id", length = 50)
    private String comicId;

    @ManyToOne
    @JoinColumn(name = "comic_id", referencedColumnName = "comic_id", insertable = false, updatable = false)
    private Comics comics;

    @NotNull
    @Column(name = "chapter_id", length = 50)
    private String chapterId;

    @ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id", insertable = false, updatable = false)
    private Chapters chapter;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;
}
