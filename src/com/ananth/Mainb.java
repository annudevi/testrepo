package com.ananth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("your name is : " + name);
        scanner.close();
        System.out.println("hi how are ");
    }
}
