package org.example.Class11;



public class E1String {
    // we are creating object of string class and storing
    // that object in the str variable
    public static void main(String[] args) {
        String str=new String("Today is Java");
        // we are calling length method from String class using it's object "str"
        // this method is returning the number of characters which we are storing in len variable
        int len=str.length();
        System.out.println(len);
        System.out.println(str.length());

        if(len>4){
            System.out.println("String is too long");
        }

    }






}
