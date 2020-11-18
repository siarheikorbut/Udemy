package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_1.p2;

import com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_1.p1.X;

/**
 * @author Siarhei Korbut
 * 1. Каков будет результат компиляции и запуска класса Y?
 */

public class Y extends X {
    public Y() {
    }

    public void abc() {
        System.out.println('Y');
    }

    public static void main(String[] args) {
        Y y = new Y();
        y.abc();
    }
}
