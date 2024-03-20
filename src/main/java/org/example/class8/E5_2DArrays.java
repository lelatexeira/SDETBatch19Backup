package org.example.class8;

public class E5_2DArrays {
    public static void main(String[] args) {

        for(int j=0;j<4;j++){  //outer loop controls columns&how many times the loop runs
            for(int i=0;i<7;i++){  // inner loop controls rows&iterations
                System.out.print("*"); // when O.loop is true, it executes the body next
            }
            System.out.println();
        }
    }
}
