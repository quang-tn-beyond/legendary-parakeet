package application.aicomic.dataAccess;

import java.util.List;

import application.aicomic.models.Comics;
import lombok.Data;

@Data
public class GenresDTO {
    private String genresId;
    private String genresName;
    private String genresDescription;
    private List<Comics> comics;
}