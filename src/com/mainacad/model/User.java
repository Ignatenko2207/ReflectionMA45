package com.mainacad.model;

public class User extends BaseEntity{
    private String login;
    private String password;
    private String firstName;
    private String secondName;

    public User() {
    }

    public User(Integer id, String login, String password, String firstName, String secondName) {
        this.setId(id);
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
    }

}
