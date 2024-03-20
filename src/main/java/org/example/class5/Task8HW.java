package org.example.class5;

import java.util.Scanner;

public class Task8HW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        if(number>=1 && number<10){
            System.out.println("The number is small");
        }else if(number>=11 && number<=100){
            System.out.println("This number is medium");
        }else if(number>=101 && number<=1000){
            System.out.println("This number is large");
        }

    }
}
