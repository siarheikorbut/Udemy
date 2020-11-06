package com.udemy.zaur_tregulov.course_1.homework.lesson_9.lesson_9_2;

/**
 * @author Siarhei Korbut
 * 1. Вычислить Output данной програмы.
 */

public class Test_2 {
    int a = 1;
    static int b = 2;

    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test_2.b);
    }

    public static void main(String[] args) {
        abc((int) (Math.random() * 100));
    }
}