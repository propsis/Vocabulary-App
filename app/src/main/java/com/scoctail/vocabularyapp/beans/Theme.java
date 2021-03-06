package com.scoctail.vocabularyapp.beans;

/**
 * Created by Kaisu on 27/3/17.
 */

public class Theme {
    int id;
    String name;
    String description;

    public Theme(String name) {
        this.name = name;
    }

    public Theme() {
    }

    public Theme(int id) {
        this.id = id;
    }

    public Theme(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
