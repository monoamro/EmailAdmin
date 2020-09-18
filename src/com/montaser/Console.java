package com.montaser;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInfo(String prompt) {
        System.out.print(prompt);
        return scanner.next().toLowerCase();
    }

    public static String getDepartment() {
        System.out.println("Please enter the code for the department: \n" +
                "1- Accounting\n" +
                "2- Development\n" +
                "3- HR\n" +
                "0- none");
        int code = scanner.nextInt();
        while (code < 0 || code > 3) {
            System.out.println("Please enter a valid code: (1- Accounting, 2- Development, 3- HR, 0- None)");
            code = scanner.nextInt();
        }

        if (code == 1) return "acc.";
        else if (code == 2) return "dev.";
        else if (code == 3) return "hr.";
        else return "";
    }
}
