package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); //With this line we are creating the object of the scanner class
        System.out.println("Please enter your name");
        String name=scanner.nextLine(); //this can process as many words, paragraphs at a time
        System.out.println(name);
    }
}
