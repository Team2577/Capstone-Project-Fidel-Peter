package com.capstoneproject.fidel_peter;

public class fidel_peter_Restaurant {
    private int id;
    private String name;
    private String img_url;
    private String description;

    public fidel_peter_Restaurant(int id, String name, String description, String img_url) {
        this.id = id;
        this.name = name;
        this.img_url = img_url;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getDescription() {
        return description;
    }
}
