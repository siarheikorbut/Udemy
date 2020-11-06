package com.udemy.zaur_tregulov.course_1.homework.lesson_10.p4;

import com.udemy.zaur_tregulov.course_1.homework.lesson_10.p1.A;
import com.udemy.zaur_tregulov.course_1.homework.lesson_10.p1.p2.B;
import com.udemy.zaur_tregulov.course_1.homework.lesson_10.p1.p2.p3.C;
import com.udemy.zaur_tregulov.course_1.homework.lesson_10.p4.p5.E;

public class D {
    public static void main(String[] args) {

        //Создание обьекта класса A и вызов его метода.
        A a = new A();
        a.showDateTime();

        //Вызов статического класса B и его метода.
        B.abc((int) (Math.random() * 100));

        //Создание обьекта класса C и вызов его метода.
        C c = new C();
        c.printArray();

        //Создание обьекта внутреннего статического класса Car, класса E и вызов его метода.
        E.Car car = new E.Car("BMW", "323i", 1985, "Зелёный");
        car.showCarInfo();
    }
}