package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Chat extends BaseEntity{

    @OneToMany(mappedBy = "chat")
    Collection<Message> messages = new ArrayList<>();

//    @ManyToMany
//    Collection<User> users = new ArrayList<>();
//    Collection<Event> events = new ArrayList<>();
//    @OneToOne(mappedBy = "chat")
//    private Project project;
}
