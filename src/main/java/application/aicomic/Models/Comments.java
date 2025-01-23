package application.aicomic.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comments")
@Data
public class Comments {
    @Id
    @Column(name = "comment_id", length = 50)
    private String commentId;

    @Column(name = "content", length = 250)
    private String content;

    @NotNull
    @Column(name = "user_id", length = 50)
    private String userId;

    @NotNull
    @Column(name = "chapter_id", length = 50)
    private String chapterId;

    @NotNull
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @NotNull
    @Column(name = "status")
    private byte status;

    @ManyToOne
    @JoinColumn(name = "chapter_id", referencedColumnName = "chapter_id", insertable = false, updatable = false)
    private Chapters chapter;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private Users user;
}
