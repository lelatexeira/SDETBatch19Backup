package org.example.class4;

public class Task7 {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 7;
        int num3 = 11;

        if (num1 < num2) {
            if (num1 > num3) {
                System.out.println("Num 1 is the largest number");
            }
        } else if (num2 > 1) {
        }
        if (num2 > num3) {
            System.out.println("Num 2 is the largest number");
        } else if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("Num 3 is the largest number");
            }
        }
    }
}
