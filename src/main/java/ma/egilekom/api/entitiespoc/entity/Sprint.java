package ma.egilekom.api.entitiespoc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.egilekom.api.entitiespoc.enums.SprintStatus;

import java.util.ArrayList;
import java.util.Collection;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Sprint extends BaseEntity{
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private String goal;

    @Enumerated(EnumType.STRING)
    private SprintStatus status;


    @OneToMany(mappedBy = "sprint")
    private Collection<Issue> issues = new ArrayList<>();

    @OneToOne()
    private SprintPlanning sprintPlanning;
    @OneToMany(mappedBy = "sprint")
    private Collection<SprintRetrospective> sprintRetrospective = new ArrayList<>();

    @ManyToOne
    private Backlog backlog;

}
