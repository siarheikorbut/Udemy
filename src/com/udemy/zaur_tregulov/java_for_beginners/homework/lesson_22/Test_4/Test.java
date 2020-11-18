package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_4;

/**
 * @author Siarhei Korbut
 * 1. Каков будет результат компиляции и запуска класса Test?
 */

class X {
}

class Y extends X {
}

public class Test {
    public static void abc(X x, Y y) {
        System.out.println("Привет");
    }

    public static void abc(Y y, X x) {
        System.out.println("Пока");
    }

    public static void main(String[] args) {
        Y a = new Y();
        //abc(a, a); Из-за того, что переменная метод abc класса Тест является двусмысленным, данная программа не компилируется.
    }
}