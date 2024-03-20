package org.example.class5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scan.nextLine().toLowerCase();
        switch (month){
            case("march"):
            case("april"):
            case("may"):
                System.out.println("You were born in season spring");
                break;
            case("june"):
            case("july"):
            case("august"):
                System.out.println("You were born in season summer");
                break;
            case("september"):
            case("october"):
            case("november"):
                System.out.println("You wer born in autumn");
                break;
            case("december"):
            case("january"):
            case("february"):
                System.out.println("You were born in winter");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
