package org.example.class2;

public class Task2Strings {
    public static void main(String[] args) {

        String firstName="Joe";
        String lastName="Schmoe";


        String city="San Francisco";
        String state="California";
        String phone="867-5309";
        System.out.println("My first name is "+firstName+ " My last name is "+ lastName);
        System.out.println("I live in the city "+city+" and the state "+state);
        System.out.println("And my phone number is "+phone);

        String city2="Tallahasse";
        String state2="Florida";
        String phone2="300-1133";
        String fullName=firstName+ " "+lastName;
        System.out.println("My name is "+fullName+ " and I moved to new city "+city2+ " and new State "+state2);
        System.out.println("My new number is "+phone2);
    }
}
