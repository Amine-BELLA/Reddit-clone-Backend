package reddit.clone.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Username should not be blank")
    private String username;

    @NotBlank(message = "Password should not be blank")
    private String password;

    @Email
    @NotBlank(message = "Email should not be blank")
    private String email;

    private Instant created;

    private boolean enabled;
}
