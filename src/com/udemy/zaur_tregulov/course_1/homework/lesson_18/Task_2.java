package com.udemy.zaur_tregulov.course_1.homework.lesson_18;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одиним методом, метод должен называться showArray и
 * принимать в параметры двумерный массив типа String. Метод должен выводить
 * в консоль массив в виде {{элемент00, элемент01}{элемент10}{элемент10, элемент01}}.
 * отсортированный по возрастанию массив.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_2 {

    //Вывод в консоль двумерного массива.
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String[][] array = {
                {"Белый", "Черный", "Красный"},
                {"Синий", "Зеленый"},
                {"Голубой", "Фиолетовый", "Оранжевый", "Коричневый"}
        };
        showArray(array);
    }
}
