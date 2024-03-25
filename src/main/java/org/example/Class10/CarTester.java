package org.example.Class10;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaCar=new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Prius";
        toyotaCar.year=2024;
        toyotaCar.color="Red";
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBrakes();

        Car hondaCar=new Car();
        hondaCar.make="Honda";
        hondaCar.model="Accord";
        hondaCar.year=2024;
        hondaCar.color="blue";
        hondaCar.price=50000;
        System.out.println(hondaCar.make);
        System.out.println(hondaCar.model);
        System.out.println(hondaCar.year);
        System.out.println(hondaCar.price);
        hondaCar.moveForward();
        hondaCar.applyBrakes();



    }
}
