package org.example.class5;

import java.util.Scanner;

public class Task6IfAnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int height=60;

        if(height<60){
            System.out.println("You are short");
        }else if(height>=60&&height<72){
            System.out.println("You are medium");
        }else{
            System.out.println("You are tall");
        }

        }
    }

