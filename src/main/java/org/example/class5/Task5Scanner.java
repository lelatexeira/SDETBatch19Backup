package org.example.class5;

import java.util.Scanner;

public class Task5Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many years have you worked");
        int years = scan.nextInt();
        System.out.println("What is your salary");
        double salary=scan.nextDouble();
        if (years >= 5) {
            System.out.println("You are eligible for a bonus");
        if(salary>=50000){
            System.out.println("Your bonus is 5000");
        }else{
            System.out.println("Your bonus is 3000");
        }

        }else{
            System.out.println("You are not eligible for a bonus");
        }
    }
}