package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Siarhei Korbut
 * 1. Создать класс Car с тремя переменными: цвет, мотор и колличество дверей.
 * 2. Создайте класс CarTest с двумя методами. Первый метод должен изменять колличество дверей объекта класса
 * Car, на колличество прописанное в параметре метода. Второй метод должен принимать в параметры два объекта
 * класса Car и менять их цвета местами.
 * 3. Продемонстрировать работу созданных методов в методе main и вывести в консоль атрибуты всех объектов.
 */

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
    //Изменение колличества дверей объекта класса Car.
    void changeDoorCount(Car car, int newDoorCount) {
        car.doorCount = newDoorCount;
    }

    //Изменение местами цветов объектоктов класса Car.
    void changeColor(Car car1, Car car2) {
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        CarTest ct = new CarTest();
        Car car1 = new Car("Черный", "V10", 2);
        Car car2 = new Car("Синий", "V8", 4);
        ct.changeDoorCount(car1, n);
        ct.changeColor(car1, car2);

        System.out.printf(
                """
                        Информация о первом автомобиле:                                                
                        Цвет - %s
                        Двигатель - %s
                        Колличество дверей - %d
                                                
                        """,
                car1.color,
                car1.engine,
                car1.doorCount
        );
        System.out.printf(
                """
                        Информация о втором автомобиле:                       
                        Цвет - %s
                        Двигатель - %s
                        Колличество дверей - %d
                        """,
                car2.color,
                car2.engine,
                car2.doorCount
        );
    }
}
