package com.company;

public class Car {
    //default constructor
    Car(){
        System.out.println("this default constructor");
    }




    //Attributes


    int speed;
    String name;
    String color;

    //Method

      void turnOn() {
        System.out.println("Car is turned on");
    }

    void brake() {
        System.out.println("break");
    }

    void turnOff() {
        System.out.println("Car has been turned off");
    }


}
