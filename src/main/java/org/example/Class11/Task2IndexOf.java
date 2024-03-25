package org.example.Class11;

public class Task2IndexOf {
    // Create a String and if the String is not empty perform the following:
    //if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
    //For Example String str=hello =>l  INTERVIEW QUESTION!!!
    public static void main(String[] args) {
        String st="hello";

        if(!st.isEmpty()){

            if(st.length()%2!=0&&st.length()>3){
                int middleIndex=st.length()/2;
                System.out.println(st.charAt(middleIndex));
            }
        }
    }
}
