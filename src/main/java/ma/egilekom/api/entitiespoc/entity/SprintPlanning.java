package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.Entity;
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
public class SprintPlanning extends BaseEntity{

    // TODO: 3/12/2023 Implement SprintPlanning.java entity class's the sprint planning
    //  come before the sprint so in this cases the Sprint Planning will hold the sprint , it will act as sprint create event

    private String name;
    private String description;
    private Collection<String> sprintGoals = new ArrayList<>();


}
