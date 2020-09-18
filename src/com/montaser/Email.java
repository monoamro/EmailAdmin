package com.montaser;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private String alternativeEmail;
    private int capacity = 500;

    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = createEmail();
        this.password = PasswordConstructor.createPassword();
    }

    private String createEmail() {
        String suffix = "@" + department + "oracel.com";
        return firstName + "." + lastName + suffix;
    }

    // Getters and Setters

    public String getEmail() {
        return email;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
