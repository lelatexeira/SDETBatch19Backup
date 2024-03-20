package org.example.class5;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Task1Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        int loanAmount = scanner.nextInt();

        if(loanAmount<=200000){
            System.out.println("You can have a loan");
        }else{
            System.out.println("Your loan is denied");
        }
        }


        }





