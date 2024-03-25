package org.example.Class11;

public class Task1String {
    public static void main(String[] args) {
        String userName="Admin";
        String password="Pass123";
        String confirmPassword="Admin123";
        if(userName.isEmpty()||password.isEmpty()) {
            System.out.println("Username and password can't be empty");
        }if(password.length()<8){
            System.out.println("password is too short");
        }if(password.contains(userName)) {
            System.out.println("Passwords can't contain username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Password doesn't match");
        }else{
            System.out.println("Your username and password have been created");
        }
    }
}
