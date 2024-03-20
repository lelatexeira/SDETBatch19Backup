package org.example.review4;

import java.util.Scanner;

public class E5DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();
        while(number<10){
            System.out.println("Please enter a number");
            number=scan.nextInt();
        }
    }
}
