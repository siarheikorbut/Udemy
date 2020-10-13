package com.udemy.zaur_tregulov.course_1.homework.lesson_6;

/**
 * @author Siarhei Korbut
 * Создать класс в котором будет 5 overloaded методов, которые вычмсляют сумму нуля, одного, двух, трёх и четырёх
 * целых чисел, передают эту сумму в output и выводят её в консоль. В случае если слагаемые отсутствуют (т.е. когда
 * параметров нет) сумма должна равняться нулю. Продемонстрировать работу созданных методов в тестовом классе.
 */


public class Summirovanie {
    int sum() {
        int result = 0;
        System.out.println("Сумма всех чисе: " + result);
        return result;
    }

    int sum(int a) {
        int result = a;
        System.out.println("Сумма всех чисе: " + result);
        return result;
    }

    int sum(int a, int b) {
        int result = a + b;
        System.out.println("Сумма всех чисе: " + result);
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Сумма всех чисе: " + result);
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Сумма всех чисе: " + result);
        return result;
    }
}

class SummirovanieTest {
    public static void main(String[] args) {
        Summirovanie summa = new Summirovanie();
        summa.sum();
        summa.sum(2);
        summa.sum(3, 4);
        summa.sum(6, 8, 2);
        summa.sum(33, 54, 12, 9);
    }
}