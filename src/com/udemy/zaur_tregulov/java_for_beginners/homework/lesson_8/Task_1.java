package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_8;

/**
 * @author Siarhei Korbut
 * 1. Создать класс и реализовать в нем два статических метода.
 * 2. Первый метод должен умножать три числа из параметров метода и возвращать их
 * произведение.
 * 3. Второй метод должен делить первое число из параметров на второе число и ничего
 * не возвращать. Он должен выводить в консоль в читабельном виде целое частное и
 * остаток.
 * 4. В тестовом классе продемонстрировать работу созданных методов по два раза каждый.
 */

public class Task_1 {
    static double mul(double a, double b, double c) {
        return a * b * c;
    }

    static void div(int a, int b) {
        System.out.println("Целое частное = " + a / b + " ; остаток " + a % b);
    }
}

class Task_1Test {
    public static void main(String[] args) {
        System.out.println("Произведение = " + Task_1.mul(2, 4, 8));
        Task_1.div(55, 5);
        System.out.println("Произведение = " + Task_1.mul(3.5, 8.4, 9.3));
        Task_1.div(56, 3);
    }
}