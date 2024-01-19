package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Backlog extends BaseEntity{
    private String title;
    @OneToMany(mappedBy = "backlog")
    private Collection<Sprint> sprints = new ArrayList<>();

    @OneToMany(mappedBy = "backlog")
    private Collection<Epic> epics = new ArrayList<>();

    //: BY DEFAULT ALL ISSUE WILL BE IN THE BACKLOG SO AND ALSO THEY WILL HAVE THEIR SPRINT AND EPIC NULL
    @OneToMany(mappedBy = "backlog")
    private  Collection<Issue> issues  = new ArrayList<>();
}
