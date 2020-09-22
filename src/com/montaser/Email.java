package com.montaser;

public class Email {
    private User user;
    private String email;
    private String password;
    private String alternativeEmail;
    private int capacity = 500;

    public Email(User user) {
        this.user = user;
        this.email = createEmail();
        this.password = PasswordConstructor.createPassword(18);
    }

    private String createEmail() {
        String suffix = "@" + user.getDepartment() + "oracel.com";
        return user.getFirstName() + "." + user.getLastName() + suffix;
    }

    // Getters and Setters

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

    @Override
    public String toString() {
        return email;
    }
}
