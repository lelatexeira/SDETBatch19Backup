package org.example.class5;

import java.util.Scanner;

public class Task11HW {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        double quiz=scan.nextDouble();
        System.out.println("Enter your mid term score");
        double midterm=scan.nextDouble();
        System.out.println("Enter your final score");
        double finalScore=scan.nextDouble();
        double averageScore=(quiz+midterm+finalScore)/3;

        if(averageScore>90){
            System.out.println("Your grade is an A");
        }else if(averageScore>70){
            System.out.println("Your grade is a B");
        }else if(averageScore>=50){
            System.out.println("Your score is a C");
        }else{
            System.out.println("Your grade is an F");
        }

    }
}
