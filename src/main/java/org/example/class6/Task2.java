package org.example.class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter grade");
        char grade=input.next().toLowerCase().charAt(0); // always single 'char'. whenever we take one character from keyboard&apply charAt()method. which only extracts first letter

        switch(grade){
            case 'a':
                System.out.println("excellent");
                break;
            case 'b':
                System.out.println("good");
                break;
            case 'c':
                System.out.println("average");
                break;
            case 'd':
                System.out.println("bad");
                break;
            default:
                System.out.println("unacceptable");

        }
    }
}
