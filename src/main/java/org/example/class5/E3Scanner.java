package org.example.class5;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); //With this line we are creating the object of the scanner class
        System.out.println("Please enter your FirstName");
        String firstName=scanner.next(); //this only processes one word at a time
        System.out.println(firstName);

    }
}
