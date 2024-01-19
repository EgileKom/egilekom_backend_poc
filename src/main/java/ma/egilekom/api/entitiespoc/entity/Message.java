package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class Message extends BaseEntity{

    @ManyToOne
    private User author;
    private String text;
    @ManyToOne
    private Chat chat;
    //: add attchements
    @OneToMany(mappedBy = "message")
    private Collection<Attachment> attachments = new ArrayList<>();

}
