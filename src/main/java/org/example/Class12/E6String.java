package org.example.Class12;

public class E6String {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        for(int i=0;i<10000;i++){
            s.append(i);
        }
    }
}
