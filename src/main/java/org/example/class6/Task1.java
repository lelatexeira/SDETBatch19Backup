package org.example.class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country name");
        String country=scan.nextLine().toLowerCase(); //why won't it use this method??
        // always use switch if can(instead if else if) with multiple variables
        switch(country){
            case "usa":
                System.out.println("We speak english");
                break;
            case "spain":
                System.out.println("We speak spanish");
                break;
            case "france":
                System.out.println("We speak french");
                break;
            case "china":
                System.out.println("We speak chinese");
                break;
            case "italy":
                System.out.println("We speak italian");
                break;
            default:
                System.out.println("Country not supported");

        }
    }
}
