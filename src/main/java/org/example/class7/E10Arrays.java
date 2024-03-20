package org.example.class7;

public class E10Arrays {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6};
        int sum=0; ///this is important loop! it adds sum!
        for(int num:numbers){
            sum=num+sum;
        }
        System.out.println(sum);
    }












}
