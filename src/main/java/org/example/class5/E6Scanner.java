package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Please enter your full name");
        scanner.nextLine(); //The problem of printing, if you use any method
        // BEFORE nextLine method. Extra call to nextLine to clear the buffer memory
        String fullName=scanner.nextLine();
        System.out.println("Your name is "+fullName+ "You are "+age+ " years old");

    }
}
