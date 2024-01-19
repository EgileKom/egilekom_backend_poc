package ma.egilekom.api.entitiespoc.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class SprintRetrospective  extends  BaseEntity{

    private String  whatWentWell ;
    private String whatWentWrong ;
    private String whatCanWeImprove ;

    @ManyToOne
    private User user ;

    @ManyToOne
    private Sprint sprint;
}
