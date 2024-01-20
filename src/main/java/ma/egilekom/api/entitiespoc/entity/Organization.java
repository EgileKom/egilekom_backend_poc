package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Organization extends BaseEntity {

    @NotBlank(message = "please provide a name")
    private String name;
    @NotBlank(message = "please provide a description")
    private String description;
    @NotBlank(message = "please provide a avatar")
    private String avatar;
    @NotBlank(message = "please provide a website")
    private String website;
    @Email(message = "please provide a valid email")
    private String email;
    @Pattern(regexp = "(^$|[0-9]{10})", message = "phone number must be 10 digits")
    private String phone;
    @NotBlank(message = "please provide a address")
    private String address;

    @OneToMany(mappedBy = "organization")
    private Collection<Project> projects = new ArrayList<>();

    @Override
    public String toString() {
        return "Organization{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", avatar='" + avatar + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
