package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Epic extends BaseEntity {
    private String name;
    private String description;
    private String color;
    @ManyToOne
    private User user;

    @ManyToOne
    private Backlog backlog;


}
