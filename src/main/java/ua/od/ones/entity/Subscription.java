package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;

@Entity
@Data
public class Subscription {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private User user;

    @ManyToMany
    private Issue issue;

    private int publicationId;
    private Date startDate;
    private Date endDate;
    private int price;
}
