package ua.od.ones.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Subscription {
    private static final long serialVersionUID = -7558253885188743L;

    private int id;
    private int userId;
    private int publicationId;
    private Date startDate;
    private Date endDate;
    private int price;
}
