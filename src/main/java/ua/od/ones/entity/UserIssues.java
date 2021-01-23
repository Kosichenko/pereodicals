package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class UserIssues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int publicationId;
    private Date startDate;
    private Date endDate;
    private int price;

    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "id")
    private List<User> users;

    @OneToMany(mappedBy = "issue")
    @JoinColumn(name = "id")
    private List<Issue> issues;
}
