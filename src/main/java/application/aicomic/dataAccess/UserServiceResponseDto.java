
package application.aicomic.dataAccess;

import application.aicomic.models.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@AllArgsConstructor

@NoArgsConstructor

@Builder
public class UserServiceResponseDto {
    // public UserServiceResponseDto(boolean succeed, String message, List<Users>
    // users) {
    // this.succeed = succeed;
    // this.message = message;
    // this.users = users;
    // }

    private boolean succeed;
    private String message;
    private List<Users> users;
}
