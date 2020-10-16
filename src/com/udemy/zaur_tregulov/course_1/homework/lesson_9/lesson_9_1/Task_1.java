package com.udemy.zaur_tregulov.course_1.homework.lesson_9.lesson_9_1;

/**
 * @author Siarhei Korbut
 * 1. Написать программу в которой будет создано 8 обьектов, но к последней строке
 *    метода main останется всего два.
 */

public class Task_1 {

    //Создание двух обьектов класса String.
    public static void createObject() {
        String s1 = new String("s1");
        String s2 = new String("s2");
    }

    public static void main(String[] args) {

        //Создание обьекта класса Task_1.
        Task_1 t1 = new Task_1();

        //Вызов метода createString.
        createObject();
        createObject();

        //Создание обьекта класса String.
        String s3 = new String("s3");

        //Вызов метода createString.
        createObject();
    }
}