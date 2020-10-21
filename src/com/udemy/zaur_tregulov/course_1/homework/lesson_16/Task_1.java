package com.udemy.zaur_tregulov.course_1.homework.lesson_16;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одиним методом, метод должен называться emailInfo и принимать
 * в параметре тип данных String один раз. Данный параметр должен содержать в себе
 * e-mail-ы в следующем виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; т.е.
 * после каждого e-mail должен стоять знак препинания ";". Метод должен выводить
 * в консоль информацию о том, какой почтой пользуются, исходя из параметра,
 * т.е. output должен быть следующего вида: yahoo, mail, gmail.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {

    //Поиск в строке нужного участка и вывод его в консоль.
    void emailInfo(String email) {
        for (int i = 0; i < email.length() - 1; i++) {
            int a = email.indexOf('@', i);
            int b = email.indexOf('.', i);
            i = email.indexOf(';', i);
            System.out.println("Пользователь использует почту: "+ email.substring(a + 1, b));
            }
        }

    public static void main(String[] args) {
        Task_1 t = new Task_1();
        t.emailInfo("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}