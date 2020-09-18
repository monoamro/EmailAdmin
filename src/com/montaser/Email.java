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
    }

    private String createEmail() {
        String suffix = "@" + department + "oracel.com";
        return firstName + "." + lastName + suffix;
    }

    public String getEmail() {
        return email;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }
}
