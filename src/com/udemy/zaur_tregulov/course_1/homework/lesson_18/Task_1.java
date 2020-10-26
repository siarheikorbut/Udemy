package com.udemy.zaur_tregulov.course_1.homework.lesson_18;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с двумя методоми, первый метод должен называться sorting (сортировка) и
 * принимать в параметры одномерный массив типа int. Метод должен возвращать
 * отсортированный по возрастанию массив. Второй метод должен называться showArray
 * (покажи массив) и принимать в параметры одномерный массив типа int. Метод должен
 * выводить в консоль созданный массив в {элемент 0, элемент 1, элемент 2, и т.д.}
 * 2. Продемонстрировать работу созданных методов.
 */

public class Task_1 {

    //Сортировка одномерного массива по возрастанию методом пузырька.
    public static void sorting(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                temp = array[i];
                array[i] = min;
                array[index] = temp;
            }
        }
    }

    //Вывод в консоль одномерного массива.
    public static void showArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
        }
        sorting(array);
        showArray(array);
    }
}