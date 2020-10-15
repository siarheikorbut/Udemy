package com.udemy.zaur_tregulov.course_1.homework.lesson_8;

/**
 * @author Siarhei Korbut
 * 1. Создать класс и реализовать в нем final static переменную PI равную 3.14.
 * 2. Создать нестатический метод который принимает в параметре значение радиуса и вычисляет площадь круга
 *    по формуле Площадь = ПИ * радиус * радиус.
 * 3. Создать статичкский метод который принимает в параметре значение радиуса и вычисляет длину окружности
 *    по формуле Площадь = 2 * ПИ * радиус.
 * 4. Создать нестатический метод который принимает в параметре значение радиуса и выводит в консоль
 *    информацию о радиусе, площади круга, длине окружности.
 * 5. В тестовом классе продемонстрировать работу созданных методов.
 */

public class Task_2 {

    public final static double PI = 3.14;

    //Вычисление площади круга.
    double areaOfCircle(double radius) {
        return Math.round(((PI * radius * radius) * 100.0) / 100.0);
    }

    //Вычисление длины окружности.
    static double circumference(double radius) {
        return Math.round(((2 * PI * radius) * 100.0) / 100.0);
    }

    //Вывод в консоль радиуса, площади круга, длины окружности.
    void printer(double radius) {
        System.out.println("Радиус = " + Math.round((radius) * 100.0) / 100.0);
        System.out.println("Площадь круга = " + areaOfCircle(Math.random() * 10));
        System.out.println("Длина окружности = " + circumference(Math.random() * 10));
    }
}

class Task_2Test {
    public static void main(String[] args) {

        Task_2 t = new Task_2();
        t.areaOfCircle(Math.random() * 10);
        Task_2.circumference(Math.random() * 10);
        t.printer(Math.random() * 10);
    }
}