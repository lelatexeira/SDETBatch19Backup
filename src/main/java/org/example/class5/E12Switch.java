package org.example.class5;

import java.util.Scanner;

public class E12Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int day=5;  //Same as switch. Always use switch when can

        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Wrong day");
        }


        }
    }

