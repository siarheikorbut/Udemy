package com.udemy.zaur_tregulov.course_1.homework.lesson_15;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одним статическим методом, который должен выводить в консоль
 * время в формате "час:минута:секунда", в интервале от 0 до 6 часов. Если час
 * больше единицы и минута кратна 10, то метод необходимо закончить. Если секунда
 * умноженная на час больше минуты, то пора переходить на другую минуту. Использовать
 * циклы while для внешнего и внутренних циклов и do while для среднего цикла.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {

    //Вывод времени в консоль в заданном интервале и формате.
    static void timeInfo() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            } while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        timeInfo();
    }
}
