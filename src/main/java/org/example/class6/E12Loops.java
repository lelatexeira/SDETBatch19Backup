package org.example.class6;

import java.util.Scanner;

public class E12Loops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point of the loop");
        int start=scanner.nextInt();
        System.out.println("Please enter the ending number");
        int end=scanner.nextInt();
        System.out.println("Please enter the step size");
        int stepSize=scanner.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start+stepSize;
        }



        }



        }


