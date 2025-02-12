
package application.aicomic.dataAccess;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ComicsDTO {
    private String comicId;
    private String comicName;
    private String coverUrl;
    private String userId;
    private LocalDate createdDate;
    private int quantityChap;
    private String description;
    private byte status;

}
