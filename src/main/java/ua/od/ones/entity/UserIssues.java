package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class UserIssues {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private List<User> user;

    @ManyToMany
    private Issue issue;

    private int publicationId;
    private Date startDate;
    private Date endDate;
    private int price;
}
