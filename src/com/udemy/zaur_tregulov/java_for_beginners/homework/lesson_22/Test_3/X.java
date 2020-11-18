package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_22.Test_3;

/**
 * @author Siarhei Korbut
 * 1. Каков будет результат компиляции и запуска класса X и Y?
 */

public class X {
    public X() {
        System.out.println("X");
    }

    public X(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.abc());
    }
}

class Y extends X {

    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}