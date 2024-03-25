package org.example.Class12;

public class E2String {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Sunday7343Monday");
        //st.deleteCharAt(6);
        // Only deletes 1 character
        st.delete(6,10);
        System.out.println(st);
    }
}
