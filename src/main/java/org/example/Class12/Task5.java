package org.example.Class12;

public class Task5 {
    public static void main(String[] args) {
        String originalStr = "aba";
        StringBuilder st = new StringBuilder(originalStr);
        st.reverse();
        String reversedSt = st.toString();
        if (originalStr.equals(reversedSt)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



