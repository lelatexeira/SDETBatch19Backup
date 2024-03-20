package org.example.class9;

public class E6Array {
    public static void main(String[] args) { //USING ENHANCED LOOP
//CALCULATE AVERAGE OF NUMBERS GREATER THAN 25
        int[] numbers = {10, 25, 45, 66, 85, 100};
        double sum = 0;
        int counter = 0;
        for (int n : numbers) {
            if (n > 25) {
                sum = sum + n;
                counter++;


            }
        }
        System.out.println(sum / 4);
    }
}