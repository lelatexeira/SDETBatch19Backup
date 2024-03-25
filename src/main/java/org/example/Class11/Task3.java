package org.example.Class11;

public class Task3 {
    public static void main(String[] args) {
        String str="Sunday";

        for(int i=str.length()-1;i>=0;i--){  //str.length will print 0-6 out of bounds. why-1
            System.out.print(str.charAt(i));
        }
    }
}
