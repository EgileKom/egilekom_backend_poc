package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.*;
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
public class Project extends BaseEntity{
    //IF THE ORGANIZATION HAS MANY BACKLOG THEY WILL BE IN THE PROJECT EACH BACKLOG WILL HAVE MANY SPRINTS
    @OneToMany
    private Collection<Backlog> backlog = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Organization organization;
    @OneToOne()
    private Chat chat;

    @ManyToMany
    @JoinTable(
            name = "user_project",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Collection<User> users = new ArrayList<>();
}
