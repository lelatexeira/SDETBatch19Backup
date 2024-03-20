package org.example.class3;

public class E7Type {
    public static void main(String[] args) {
        int num=10;
        byte number=(byte)num; //Typecasting
        System.out.println(number);
        //byte number=num; //You will get error because you can't fit 1000 in byte
        // Narrowing can be problematic,but you can force Java with brackets
        //if values are big and can't fit in destination data type= wrong results

    }
}
