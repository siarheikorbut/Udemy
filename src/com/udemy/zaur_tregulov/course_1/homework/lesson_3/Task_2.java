package com.udemy.zaur_tregulov.course_1.homework.lesson_3;

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
