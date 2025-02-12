package application.aicomic.dataAccess;

import application.aicomic.models.Chapters;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentsDTO {
    private String commentId;
    private String content;
    private String userId;
    private String chapterId;
    private LocalDateTime createdDate;
    private byte status;
    private Chapters chapter;

}
