package com.mainacad.model;

/**
 * This is User class
 *
 */

public class User extends BaseEntity implements Cloneable{
    private String login;
    private String password;
    private String firstName;
    private String secondName;

    public User() {
    }

    /**
     *
     * @param id is set in super class
     * @param login
     * @param password
     * @param firstName
     * @param secondName
     */
    public User(Integer id, String login, String password, String firstName, String secondName) {
        this.setId(id);
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    /**
     *
     * @return clone of {@code com.mainacad.model.User} inctance
     */
    public User clone(){
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
