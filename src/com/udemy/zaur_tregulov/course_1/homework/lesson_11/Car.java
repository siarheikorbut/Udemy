package com.udemy.zaur_tregulov.course_1.homework.lesson_11;

public class Car {
    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {
    void changeDoorCount(int newDoorCount ) {

        Car car1 = new Car("Черный", "V8", 2);

    }
}