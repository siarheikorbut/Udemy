package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_3;

/**
 * @author Siarhei Korbut
 * Вычислить чему равны выражения:
 * a = a-- - --a + ++a + a++ + a; где а = 5
 * b = ++b - b++ + ++b - --b; где b = 8
 */

public class Task_2 {
    public static void main(String[] args) {
        //Вычисление выражений.
        int a = 5;
        a = a-- - --a + ++a + a++ + a;
        System.out.println("Значение a = " + a);
        int b = 8;
        b = ++b - b++ + ++b - --b;
        System.out.println("Значение b = " + b);
    }
}

