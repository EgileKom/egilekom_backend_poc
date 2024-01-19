package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
    private String name;
    private String description;
    private String avatar;
    private String website;
    private String email;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "organization")
    private Collection<Project> projects = new ArrayList<>();
}
