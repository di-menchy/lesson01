package com.company;

public class car {
    public static final boolean hasWheel = true;
    public int numberOfSeats;
    public String color;

    public Car(String myColor, int numberOfSeats) {
        this.color = myColor;
        this.numberOfSeats = numberOfSeats;

    }

    public Car() {
        this.color = "Blue";
        this.numberOfSeats = 4;
    }

    public void printInfo() {
        System.out.println("My car can have this amount of people at once: " + this.numberOfSeats);
        System.out.println("My car has a wheel:" + this.hasWheel);
        System.out.println("Color of my car is: "+ this.color);
    }
}
