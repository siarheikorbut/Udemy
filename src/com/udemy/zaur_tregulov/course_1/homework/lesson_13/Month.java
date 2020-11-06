package com.udemy.zaur_tregulov.course_1.homework.lesson_13;

/**
 * @author Siarhei Korbut
 * 1. Создать класс Month с одиним методом принимающим в параметре тип данных int.
 * Данный параметр должен указывать на парядковый номер месяца. Используя функционал
 * swith, вывести в консоль колличество дней этого месяца (для 2015 года).
 * 2. Продемонстрировать работу созданного метода в mauin.
 */

public class Month {

    //Количество дней в месяце.
    static void dayOfMonthCount(int monthNumber) {
        switch (monthNumber) {
            case 1 -> System.out.println("Количество дней в январе: 31");
            case 2 -> System.out.println("Количество дней в феврале: 28");
            case 3 -> System.out.println("Количество дней в марте: 31");
            case 4 -> System.out.println("Количество дней в апреле: 30");
            case 5 -> System.out.println("Количество дней в мае: 31");
            case 6 -> System.out.println("Количество дней в июне: 30");
            case 7 -> System.out.println("Количество дней в июле: 31");
            case 8 -> System.out.println("Количество дней в августе: 31");
            case 9 -> System.out.println("Количество дней в сентябре: 30");
            case 10 -> System.out.println("Количество дней в октябре: 31");
            case 11 -> System.out.println("Количество дней в ноябре: 30");
            case 12 -> System.out.println("Количество дней в декабре: 31");
            default -> System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        Month.dayOfMonthCount((int) (Math.random() * 13));
    }
}