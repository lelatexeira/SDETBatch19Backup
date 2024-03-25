package org.example.Class11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Write a program that reads two people's first
        //names and if they expecting boy or girl?
        //Based on the input suggests a name for a baby:
        String momName="Mary";
        String dadName="Daniel";
        boolean isBoy=true;

        if(isBoy){
            String firstHalf=dadName.substring(0,dadName.length()/2);
            String lastHalf=momName.substring(momName.length()/2,momName.length());
            System.out.println(firstHalf+lastHalf);
        }else{
            String firstHalf=momName.substring(0,dadName.length()/2);
            String lastHalf=dadName.substring(dadName.length()/2,dadName.length());
            System.out.println(firstHalf+lastHalf);
        }

    }
}
