package org.example.class6;

import java.util.Scanner;

public class Task3Switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two numbers and the operator +-*/");
        double number1=scan.nextDouble();
        double number2=scan.nextDouble();
        char ops=scan.next().charAt(0);

        switch(ops){
            case '+':
                System.out.println("The result for + ops is "+(number1+number2));
                break;
            case'-':
                System.out.println("The result for - ops is "+(number1-number2));
                break;
            case '*':
                System.out.println("The result for * ops is "+(number1*number2));
                break;
            case '/':
                System.out.println("The result for / ops is "+(number1/number2));
                break;
            default:
                System.out.println("wrong ops");



        }
    }
}
