package org.example.review4;

import java.util.Scanner;

public class E6DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Pleas enter the number");
            num=scanner.nextInt();
        }while(num<10);
    }
}
