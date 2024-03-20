package org.example.class9;

public class E5Arrays {
    public static void main(String[] args) { //ENHANCED FOR LOOP

        int[] numbers = {10, 25, 45, 66, 85, 100};
        int sum=0;
        for(int n:numbers){
            //sum+=n;
            sum=sum+n;


        }
        System.out.println(sum/numbers.length);
    }
}
