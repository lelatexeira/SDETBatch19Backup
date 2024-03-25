package org.example.Class11;

public class E5String {
    public static void main(String[] args) {
        String st="Matt likes watermelon. He is in the kitchen";
        System.out.println(st.contains("Matt"));
        System.out.println(st.contains("Matt likes watermelon"));

        st.toLowerCase().contains("Matt likes watermelon");
        System.out.println(st.startsWith("M"));
        System.out.println(st.endsWith("again"));
        st.endsWith("again");
        boolean ends=st.endsWith("again");
        System.out.println(ends);

    }
}
