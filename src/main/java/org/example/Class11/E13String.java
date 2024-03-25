package org.example.Class11;

public class E13String {
    public static void main(String[] args) {
        String str="Matt still have some time to run away";
        String[]words=str.split(" ");
        System.out.println(words[3]);
        System.out.println(words.length);
        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
