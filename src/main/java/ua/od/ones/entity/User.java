package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private String name;
    private String email;
    private String password;

    private boolean isAdmin;

    @OneToOne
    @JoinColumn(name = "loc_id")
    private Localization localization;

    @OneToMany(mappedBy = "user")
    private List<AccountOperations> operations;

    @OneToMany(mappedBy = "user")
    private List<UserIssues> userIssues;

}
