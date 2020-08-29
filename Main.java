package com.company;

public class Main {

    public static void main(String[] args) {
       // I found an error
        Car myCar = new Car();
        Car present = new Car( myColor: "Red", numberOfSeats: 4)

        myCar.printInfo();
        System.out.println("--------------------------------")
        present.printInfo();
    }
}
