package ua.od.ones.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    private String address;
    private Boolean enabled;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "localizations_id")
    private Localization localization;

    @ManyToMany(fetch = FetchType.EAGER,
              cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_operation",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "operation_id")
    )
    private List<UserOperation> userOperations;

    public void addUserOperation(UserOperation userOperation) {
        if(userOperation == null) {
            userOperations = new ArrayList<UserOperation>();
        }
        userOperations.add(userOperation);
    }
}
