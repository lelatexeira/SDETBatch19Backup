package org.example.class7;

public class E12Arrays {
    public static void main(String[] args) {

        int[]numbers={10,20,30,80,40,50}; //ENHANCED LOOP
        int max=numbers[0];
        for(int n:numbers){
            if(max<n){
                max=n;   //So important! This will update the variable and
            }
        }
        System.out.println(max);
    }
}

