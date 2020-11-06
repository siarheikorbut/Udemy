package com.udemy.zaur_tregulov.course_1.homework.lesson_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одиним методом, метод должен называться equality (равенство) и
 * принимать в параметры два объекта класса StringBuilder. Метод должен иметь boolean
 * return type и возвращать true, если значения объектов совпадают или false, если
 * значения не совпадают.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {

    //Сравнение значений двух объектов класса StringBuilder.
    public static boolean equality(StringBuilder sb1, StringBuilder sb2) {

        boolean result = true;

        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result= false;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb1 = new StringBuilder(reader.readLine());
        StringBuilder sb2 = new StringBuilder(reader.readLine());

        System.out.println(Task_1.equality(sb1, sb2));
    }
}
