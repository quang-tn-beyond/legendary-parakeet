package application.aicomic.Models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Users")
@Data
public class Users {
    @Id
    @Column(name = "user_id", length = 50)
    private String userId;

    @NotNull
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotNull
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;

    @Column(name = "avatar_url", length = 255)
    private String avatarUrl;

    @NotNull
    @Column(name = "role")
    private byte role;

    @Column(name = "status")
    private byte status;

    @OneToMany(mappedBy = "user")
    private List<Comics> comics;

    @OneToMany(mappedBy = "user")
    private List<Comments> comments;

    @OneToMany(mappedBy = "user")
    private List<Comments> reports;

    @OneToMany(mappedBy = "user")
    private List<Wallets> wallets;

    @OneToMany(mappedBy = "user")
    private List<CurrentChapter> purchasedComics;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders;

    @OneToMany(mappedBy = "user")
    private List<PurchasedCoins> purchasedCoins;

    @OneToMany(mappedBy = "user")
    private List<CurrentChapter> currentChapters;

    @ManyToMany(mappedBy = "user")
    private List<Bookshelves> bookshelves;

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public void setRole(byte role) {
            this.role = role;
        }

        public void setStatus(byte status) {
            this.status = status;
        }
}

