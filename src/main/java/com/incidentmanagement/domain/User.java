package com.incidentmanagement.domain;

public class User {
    private long id;
    private String name;

    public User(long id, String name) {
        this.id = id;
        changeName(name);
    }

    public void changeName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
}
