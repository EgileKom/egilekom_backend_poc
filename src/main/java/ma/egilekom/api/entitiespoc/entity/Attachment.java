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
public class Attachment extends BaseEntity{

    //TODO : USE CLOUDINARY OR FIRESTORE TO UPLOAD FILES THEN SAVE THE URL IN THE DATABASE
    private String file_path;
    private String description;
    @ManyToOne
    private Issue issue;
    @ManyToOne
    private User user;

    @ManyToOne
    private Message message;
}
