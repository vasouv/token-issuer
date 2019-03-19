package vs.tokenissuer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User
 */
@Entity
@Getter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    private String name;

    @Email
    @Setter
    private String email;

    @Setter
    @Size(min = 3, max = 8)
    private String password;

    @Setter
    private Role role;

    @Setter
    private boolean canLogin;

    public User() {
        super();
    }

    public User(String name, String email, String password, Role role, boolean canLogin) {
        this.canLogin = canLogin;
        this.email = email;
        this.password = password;
        this.role = role;
        this.name = name;
    }

}