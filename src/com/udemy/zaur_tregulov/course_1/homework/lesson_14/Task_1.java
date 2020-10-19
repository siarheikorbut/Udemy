package com.udemy.zaur_tregulov.course_1.homework.lesson_14;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одним статическим методом, который должен выводить в консоль
 * время в формате "час:минута:секунда", в интервале от 0 до 6 часов. Если час
 * больше единицы и минута кратна 10, то метод необходимо закончить. Если секунда
 * умноженная на час больше минуты, то пора переходить на другую минуту.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {
    static void timeInfo() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        timeInfo();
    }
}
