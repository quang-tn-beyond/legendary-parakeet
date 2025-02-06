package application.aicomic.Services;

import application.aicomic.Repositories.UsersRepository;
import org.springframework.stereotype.Service;

import application.aicomic.Enums.Role;
import application.aicomic.Models.Users;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final UsersRepository usersRepository;

    // Constructor để inject UsersRepository
    public CustomOAuth2UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) {
        OAuth2User oAuth2User = super.loadUser(userRequest);

        if (oAuth2User == null) {
            throw new RuntimeException("Failed to retrieve user information from OAuth2 provider");
        }

        // Lấy thông tin từ Google
        String email = oAuth2User.getAttribute("email");
        if (email == null) {
            throw new RuntimeException("Email not found in OAuth2 response");
        }

        // Kiểm tra và lưu người dùng vào database
        Users user = usersRepository.findByEmail(email).orElseGet(() -> {
            Users newUser = new Users();
            newUser.setEmail(email);
            newUser.setFirstName(oAuth2User.getAttribute("given_name"));
            newUser.setLastName(oAuth2User.getAttribute("family_name"));
            newUser.setRole((byte)5);
            return usersRepository.save(newUser);
        });

        return oAuth2User;
    }
}

