package org.example.Class10;

public class BankUser {
    public String loginName;
    String fullName;
    int age;
    String pin;
    String accountType;
    String loanAmount;
    int accountNumber;
    double accountBalance;
    boolean isSavingsAccount;

    void deposit(){
        System.out.println("deposit funds");

    }
    void transferFunds(){
        System.out.println("Send money to other accounts");
    }
    void withdrawl(){
        System.out.println("Withdraw funds from accounts");
    }




}
