package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_2.p2;

import com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_2.p1.X;

/**
 * @author Siarhei Korbut
 * 1. Каков будет результат компиляции и запуска класса Y?
 */

public class Y extends X {
    public void abc() {
        System.out.println('Y');
    }

    public void def() {
        Y y = new Y();
        y.abc();
    }

    public void ghi() {
        X x = new Y();
        //x.abc; Из-за того, что переменная x не видит метод abc класса X, данная программа не компилируется.
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        a.def();
        a.ghi();
    }
}
