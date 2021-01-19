package ua.od.ones.entity;


import lombok.Data;

import java.io.Serializable;

@Data
public class Issue implements Serializable {
    private static final long serialVersionUID = -7558253885188741L;

    private int id;
    private String description;
    private String fileURL;
    private int price;
    private int themeId;
}
