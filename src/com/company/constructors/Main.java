package com.company.constructors;

import com.company.constructors.Car;

public class Main {

    public static void main(String[] args) {
        //  the default constructor
        System.out.println("First constructor");
        Car c1 = new Car();
        c1.name = "BMW";
        c1.color = "Blue";
        c1.speed = 280;
        c1.turnOn();
        System.out.println(c1.color);

        // constructor with speed , name and color
        System.out.println("Second constructor with speed , name and color");
        Car c2 = new Car(200,"Audio","Red");
        c2.speed=150;
        System.out.println(c2.name);
        System.out.println(c2.speed);


        // Construct with ishatch back and speed
        System.out.println("Third constructor with ishatch back and speed");
        Car c3 = new Car(true,300);
        System.out.println(c3.isHatchBack);

    }
}
