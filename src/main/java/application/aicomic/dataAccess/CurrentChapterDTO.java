package application.aicomic.dataAccess;

import lombok.Data;

@Data
public class CurrentChapterDTO {
    private String currentChaperId;
    private byte status;
    private String comicId;
    private String chapterId;
    private String userId;
}
