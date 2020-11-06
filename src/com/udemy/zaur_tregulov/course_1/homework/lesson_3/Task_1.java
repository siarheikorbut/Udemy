package com.udemy.zaur_tregulov.course_1.homework.lesson_3;

/**
 * @author Siarhei Korbut
 * Вычислить следующую часть кода:
 * int i1 = 5;
 * int i2 = 11;
 * double d1 = 5.5;
 * double d2 = 1.3;
 * long l = 20L;
 * double result = 0;
 * double result = i2 / d1 + d2 % i1 - l;
 */

public class Task_1 {
    public static void main(String[] args) {
        //Вычисление выражения.
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = i2 / d1 + d2 % i1 - l;
        System.out.println("Результат: " + result);
    }
}

