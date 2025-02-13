package application.aicomic.dataAccess;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsersDTO {
    private String userId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String email;
    private String phoneNumber;
    private String avatarUrl;
    private byte role;
    private byte status;
}
