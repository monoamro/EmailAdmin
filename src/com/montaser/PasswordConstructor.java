package com.montaser;

public class PasswordConstructor {

    private static String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_+-=1234567890";
    private static char[] password;
    public static String createPassword() {
        password = new char[12];
        for(int i=0; i<12; i++) {
            int rand = (int) (Math.random() * 76);
            System.out.println(rand);
            System.out.println(chars.charAt(rand));
            password[i] = chars.charAt(rand);
        }
        return new String(password);
    }

    public static String createPassword(Integer length) {
        password = new char[length];
        for(int i=0; i<length; i++) {
            int rand = (int) (Math.random() * 76);
            password[i] = chars.charAt(rand);
        }
        return new String(password);
    }
}
