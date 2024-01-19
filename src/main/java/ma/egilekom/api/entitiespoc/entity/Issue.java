package ma.egilekom.api.entitiespoc.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.egilekom.api.entitiespoc.enums.IssueStatus;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Issue extends BaseEntity {

    private String title;
    private String description;
    private String type;
    private String priority;
    @Enumerated(EnumType.STRING)
    private IssueStatus status;

    @ManyToOne
    private User assignee;
    @ManyToOne
    private User reporter;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sprint sprint;
    @ManyToOne(fetch = FetchType.LAZY)
    private Epic epic;
    private String storyPoint;

    @OneToMany(mappedBy = "issue")
    private Collection<Attachment> attachments = new ArrayList<>();
    @OneToMany(mappedBy = "issue")
    private Collection<Comment> comment = new ArrayList<>();

    @ManyToOne
    private Issue issue;
    @OneToMany(mappedBy = "issue")
    private Collection<Issue> subIssue = new ArrayList<>();
    @ManyToOne
    private Backlog backlog;

}
