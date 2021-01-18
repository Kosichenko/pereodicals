package ua.od.ones.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -7558253885188742L;

    private Integer id;
    private String email;
    private String password;
    private String name;
    private Role role;
}
