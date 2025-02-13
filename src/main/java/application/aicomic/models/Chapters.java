package application.aicomic.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Chapters")
@Data
public class Chapters {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "chapter_id", length = 50)
    private String chapterId;

    @NotNull
    @Column(name = "chapter_name", length = 50)
    private String chapterName;

    @NotNull
    @Column(name = "comic_id", length = 50)
    private String comicId;

    @NotNull
    @Column(name = "comment_id", length = 50)
    private String commentId;

    @NotNull
    @Column(name = "published_date")
    private LocalDateTime publishedDate;

    @NotNull
    @Column(name = "description", length = 250)
    private String description;

    @NotNull
    @Column(name = "status")
    private byte status;

    @ManyToOne
    @JoinColumn(name = "comic_id", referencedColumnName = "comic_id", insertable = false, updatable = false)
    private Comics comic;

    @ManyToOne
    @JoinColumn(name = "comment_id", referencedColumnName = "comment_id", insertable = false, updatable = false)
    private Comments comment;

    @OneToMany(mappedBy = "chapter")
    private List<Comments> comments;

    @OneToMany(mappedBy = "chapter")
    private List<OrderDetails> orderDetails;

    @OneToMany(mappedBy = "chapter")
    private List<CurrentChapter> currentChapters;
}
