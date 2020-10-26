package com.udemy.zaur_tregulov.course_1.homework.lesson_18;

import java.util.Arrays;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одиним методом, метод должен называться sorting (сортировка) и
 * принимать в параметры одномерный массив типа int. Метод должен возвращать
 * отсортированный по возрастанию массив.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {

    //Сортировка одномерного массива по возрастанию.
    public static void sorting(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*15);
        }
        sorting(array);
        for (int number : array) {
            System.out.println(number);
        }
    }
}