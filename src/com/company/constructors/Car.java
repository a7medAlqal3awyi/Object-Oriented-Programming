package com.company.constructors;

public class Car {

    /*
    Constructor
      1) 99% public
      2) don't have return type
      3) it's name typically like class name
    */


    //Attributes
    int speed;
    String name;
    String color;
    boolean isHatchBack;

    public Car() {
    }
     public Car(boolean isHatchBack , int speed) {
        this.isHatchBack=isHatchBack;
        this.speed=speed;
        }

    public Car(int speed, String name, String color) {
        this.speed=speed;
        this.name=name;
        this.color=color;
    }




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
