package org.example.Class11;



public class E14String {
    public static void main(String[] args) {
        String str="Matt you still have time to run away. Listen to me only. Everyone else is lying.";
        String[]sentences=str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[0]);
    }
}
