package org.example.class5;

import java.sql.Time;
import java.util.Scanner;

public class Task9HW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your current time in an 24 hour format");
        double newTime = scan.nextDouble();

        if(newTime>=1&&newTime<=11){
            System.out.println("This is morning time");
        }else if(newTime>=12&&newTime<=15){
            System.out.println("This is afternoon");
        }else if(newTime>16&&newTime<=20){
            System.out.println("This is evening time");
        }else if(newTime>=21&newTime<=24){
            System.out.println("invalid input");
        }



    }
}
