package application.aicomic.dataAccess;

import lombok.AllArgsConstructor;
import java.util.List;
import lombok.NoArgsConstructor;
import application.aicomic.models.Comics;
import lombok.Data;

@AllArgsConstructor

@NoArgsConstructor

@Data
public class ComicsServiceResponseDTO {
    private boolean succeed;
    private String message;
    private List<Comics> comics;
}
