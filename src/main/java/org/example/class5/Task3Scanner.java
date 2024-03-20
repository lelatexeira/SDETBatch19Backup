package org.example.class5;

import java.util.Scanner;

public class Task3Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your city");
        String city = scan.nextLine();

        System.out.println("What is temperature in your city");
        double tempF = scan.nextDouble();
        double tempC = (tempF - 32) * 5 / 9;


        System.out.println("The temperature in " + city + " is " + tempC);
        }
    }




