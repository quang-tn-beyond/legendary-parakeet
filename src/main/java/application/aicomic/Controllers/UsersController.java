package application.aicomic.Controllers;

import application.aicomic.Models.Users;
import application.aicomic.Repositories.UsersRepository;
import application.aicomic.Services.UsersService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private final UsersService usersService;
    private final UsersRepository usersRepository;

    public UsersController(UsersService usersService, UsersRepository usersRepository) {
        this.usersService = usersService;
        this.usersRepository = usersRepository;
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{getId}")
    public Users getUserById(@PathVariable String userId) {
        return usersService.getUserById(userId);
    }

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return usersService.saveUser(user);
    }

    @DeleteMapping("/{deleteId}")
    public void deleteUser(@PathVariable String userId) {
        usersService.deleteUser(userId);
    }

    @GetMapping("/login")
    public Users getUserInfo(@AuthenticationPrincipal OAuth2User principal) {
        if (principal == null) {
            throw new RuntimeException("User is not authenticated");
        }

        String email = principal.getAttribute("email");
        System.out.println("Email from OAuth2User: " + email);

        return usersRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found in database"));

    }

    @GetMapping("/logout")
    public String logout() {
        return "You have been logged out successfully!";
    }

}

