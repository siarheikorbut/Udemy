package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_10.p1.p2.p3;

import java.util.Arrays;

public class C {

    //Вывод в консоль случайного массива.
    public void printArray() {
        int[] array = new int[(int) (Math.random() * 15)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив array = " + Arrays.toString(array));
    }
}
