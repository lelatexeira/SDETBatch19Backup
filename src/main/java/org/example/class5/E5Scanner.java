package org.example.class5;

import java.util.Scanner;

public class E5Scanner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender m/f");
        /*next is going to pick the first word
        and charAt() is going to pick the first letter from that word
         */
        char gender=scanner.next().charAt(0); //use to take character from the keyboard
        System.out.println(gender);
    }
}
