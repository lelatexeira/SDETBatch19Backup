package org.example.class5;



import java.util.Scanner;

public class Task4Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card");
        boolean haveCard=scan.nextBoolean();
        if(haveCard){
            System.out.println("What is the balance");
            double balance=scan.nextDouble();
            if(balance>1000){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }
        }else{
            System.out.println("We can offer you one");
        }

    }
    }

