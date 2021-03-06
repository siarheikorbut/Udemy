package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_2;

/**
 * @author Siarhei Korbut
 * 1. Создать по 4 переменные всех целочисленных типов данных в виде:
 * Все 4 переменные типа byte должны равняться 12 и быть записаны в разных системах счисления;
 * Все 4 переменные типа short должны равняться 1300 и быть записаны в разных системах счисления;
 * Все 4 переменные типа int должны равняться 0 и быть записаны в разных системах счисления;
 * Все 4 переменные типа long должны равняться 123456789 и быть записаны в разных системах счисления;
 * Вывести переменные в консоль.
 * 2. Создать по 2 переменные типов данных float, double и boolean.
 * Вывести переменные в консоль.
 * 3. Создать n-ное количество переменных типа данных char равных 'z' всеми возможными способами.
 * Вывести переменные в консоль.
 */

public class Task_1 {
    public static void main(String[] args) {

        //Создание переменных типа byte в различных системах счисления.
        byte a1 = 0b1100; //Двоичная система.
        byte a2 = 014; //Восьмеричная система
        byte a3 = 12; //Десятичная система.
        byte a4 = 0xC; //Шестнадцатеричная система.
        System.out.println("Значения переменных типа byte: " + a1 + ", " + a2 + ", " + a3 + ", " + a4);

        //Создание переменных типа short в различных системах счисления.
        short b1 = 0b10100010100; //Двоичная система.
        short b2 = 02424; //Восьмеричная система
        short b3 = 1300; //Десятичная система.
        short b4 = 0x514; //Шестнадцатеричная система.
        System.out.println("Значения переменных типа short: " + b1 + ", " + b2 + ", " + b3 + ", " + b4);

        //Создание переменных типа int в различных системах счисления.
        int c1 = 0b0; //Двоичная система.
        int c2 = 00; //Восьмеричная система
        int c3 = 0; //Десятичная система.
        int c4 = 0x0; //Шестнадцатеричная система.
        System.out.println("Значения переменных типа int: " + c1 + ", " + c2 + ", " + c3 + ", " + c4);

        //Создание переменных типа long в различных системах счисления.
        long d1 = 0b111010110111100110100010101L; //Двоичная система.
        long d2 = 0726746425L; //Восьмеричная система
        long d3 = 123456789; //Десятичная система.
        long d4 = 0x75BCD15L; //Шестнадцатеричная система.
        System.out.println("Значения переменных типа long: " + d1 + ", " + d2 + ", " + d3 + ", " + d4);

        //Создание переменных типа float в различных системах счисления.
        float e1 = 3.14F;
        float e2 = 54.123F;
        System.out.println("Значения переменных типа float: " + e1 + ", " + e2);

        //Создание переменных типа double в различных системах счисления.
        double f1 = 432.2131;
        double f2 = 42432.2434;
        System.out.println("Значения переменных типа double: " + f1 + ", " + f2);

        //Создание переменных типа boolean в различных системах счисления.
        boolean g1 = true;
        boolean g2 = false;
        System.out.println("Значения переменных типа boolean: " + g1 + ", " + g2);

        //Создание переменных типа char в различных системах счисления.
        char h1 = 'z';
        char h2 = '\u007A';
        char h3 = 122;
        System.out.println("Значения переменных типа char: " + h1 + ", " + h2 + ", " + h3);
    }
}