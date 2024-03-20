package org.example.class5;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String haveCard=scanner.next();
        if(haveCard.equalsIgnoreCase("yes")){

            System.out.println("What is the balance?");
            double balance=scanner.nextDouble();
            if(balance>1000.0){
                System.out.println("Pay off immediately");
            }else{
                System.out.println("You can spend more");
            }

        }else{
            System.out.println("We can offer you a card");
        }



    }
}
