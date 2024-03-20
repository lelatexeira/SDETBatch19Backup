package org.example.class6;

public class E6Loops {
    public static void main(String[] args) {
        int num = 10;
        // infinite loop as condition
        while (num > 0) {  //This loop will never execute  because it's false
            System.out.println(num);
            num++;
        }
    }
}