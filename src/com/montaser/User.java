package com.montaser;

public class User {

    private String firstName;
    private String lastName;
    private String department;

    private Email email;

    public User(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = new Email(this);
    }

    public String getName() {
        return firstName.substring(0, 1).toUpperCase() +
               firstName.substring(1) + " " +
               lastName.substring(0,1).toUpperCase() +
               lastName.substring(1);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public Email getEmail() {
        return email;
    }
}
