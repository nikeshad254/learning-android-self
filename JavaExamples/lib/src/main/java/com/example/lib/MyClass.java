package com.example.lib;

public class MyClass {
    // my first class and comment

    // this is my main function
    public static void main(String args[]) {
        greetHello();

        Car c = new Car();
        c.accelerate();
        c.accelerate();
        c.brake();
    }

    static void greetHello(){
        System.out.println("Hello to speed world");
    }
}

class Car{
    int speed;

    void tellSpeed(){
        System.out.println("Your speed is now: "+ speed);
    }
    void accelerate(){
        speed +=10;
        tellSpeed();
    }

    void brake(){
        speed = 0;
        tellSpeed();
    }
}