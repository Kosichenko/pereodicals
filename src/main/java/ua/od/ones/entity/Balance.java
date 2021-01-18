package ua.od.ones.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Balance {
    private static final long serialVersionUID = -7558253885188745L;

    private int id;
    private int userId;
    private Date date;
    private String description;
    private int sum;

}
