package ma.egilekom.api.entitiespoc.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationRequest {
    @NotBlank(message = "please provide a name")
    String name;
    @NotBlank(message = "please provide a description")
    String description;
    @NotBlank(message = "please provide a avatar")
    String avatar;
    @NotBlank(message = "please provide a website")
    String website;
    @Email(message = "please provide a valid email")
    String email;
    @NotBlank(message = "please provide a phone")
    String phone;
    @NotBlank(message = "please provide a address")
    String address;

}
