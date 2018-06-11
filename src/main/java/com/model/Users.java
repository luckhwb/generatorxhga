package com.model;

public class Users {
    private Integer uid;

    private String name;

    private Integer age;

    public Users(Integer uid, String name, Integer age) {
        this.uid = uid;
        this.name = name;
        this.age = age;
    }

    public Users() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}