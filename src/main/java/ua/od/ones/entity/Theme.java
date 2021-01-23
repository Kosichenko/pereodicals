package ua.od.ones.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Theme implements Serializable {

    private static final long serialVersionUID = -755825388518874L;


    private int id;
    private String name;

}
