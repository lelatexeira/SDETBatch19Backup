package org.example.class8;

public class E1Break {
    public static void main(String[] args) {
        String []names={"James","Iram","Matt Naughty","ubaidur","Aladdin","Ana","Silvia"};

        // Search for name "Iram" if present, print on console should print '
        // name is present'
        String name="ubaidur";
        for(String n:names){

            if(n.equals("James")){
                System.out.println(n+" is present");
                break; // saves resources!! Use break always in your loops
            }
        }
    }
}
