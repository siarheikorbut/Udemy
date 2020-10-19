package com.udemy.zaur_tregulov.course_1.homework.lesson_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Siarhei Korbut
 * 1. Создать класс в котором будет 5 overloaded методов, которые вычмсляют сумму нуля,
 * одного, двух, трёх и четырёх целых чисел, передают эту сумму в output. В случае если
 * слагаемые отсутствуют (т.е. когда параметров нет) сумма должна равняться нулю.
 * 2. Продемонстрировать работу созданных методов в тестовом классе и вывести результат в консоль.
 */

public class Summation {
    int sum() {
        return 0;
    }

    int sum(int a) {
        return a;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class SummationTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        Summation summa = new Summation();
        System.out.println("Сумма всех чисе: " + summa.sum());
        System.out.println("Сумма всех чисе: " + summa.sum(a));
        System.out.println("Сумма всех чисе: " + summa.sum(a, b));
        System.out.println("Сумма всех чисе: " + summa.sum(a, b, c));
        System.out.println("Сумма всех чисе: " + summa.sum(a, b, c, d));
    }
}