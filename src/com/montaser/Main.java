package com.montaser;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Greetings, let's create a new email!");
        String firstName = Console.getInfo("First Name: ");
        String lastName = Console.getInfo("Last Name: ");
        String department = Console.getDepartment();

        var user = new User(firstName, lastName, department);

        System.out.println(user.getName());
        System.out.println(user.getEmail().getEmailAddress());
        System.out.println(user.getEmail().getPassword());



    }

}
