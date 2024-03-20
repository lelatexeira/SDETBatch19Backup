package org.example.class9;

public class E3Arrays {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 45, 66, 85, 100};
        // 10 25 45 66 85 100 =331/6
        int sum=0;
        for (int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i];
            int average=(int)sum/numbers.length;

        }
        System.out.println(sum/numbers.length);
    }
}