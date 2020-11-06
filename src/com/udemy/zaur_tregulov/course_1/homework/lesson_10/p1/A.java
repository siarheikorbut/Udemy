package com.udemy.zaur_tregulov.course_1.homework.lesson_10.p1;

import java.util.Date;

/**
 * @author Siarhei Korbut
 * 1. Создать пакет p1, в нем класс A.
 * 2. Создать подпакет p2 в пакете p1, в нем класс B со статическими элементами.
 * 3. Создать подпакет p3 в подпакете p2, в нем класс C.
 * 4. Создать новый пакет p4, в нем класс D.
 * 5. Создать подпакет p5 в пакете p4, в нем класс E.
 * 6. Внутри класса D написать код, который будет задействовать любые элементы классов A, C, E,
 * а так же статические элементы класса B.
 * 7. Использую выражения import и import static работать с неполными именами классов.
 */

public class A {

    //Вывод в консоль текущей даты и времени.
    public void showDateTime() {
        Date currentTime = new Date();
        System.out.println("Текущая дата и время: " + currentTime);
    }
}
