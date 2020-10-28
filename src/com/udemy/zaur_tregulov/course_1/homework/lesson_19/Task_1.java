package com.udemy.zaur_tregulov.course_1.homework.lesson_19;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одним методом. Метод должен называться abc и принимать в
 * параметры N-ое количество одномерных массивов типа String. В методе создать
 * новый массив, который будет состоять из элементов массивов параметров и будет
 * outout-ом данного метода.
 * 2. В методе main вызвать метод abc. Его элементам, которые равны command line
 * параметрам, присвоить значение null.
 * 3. Вывести элементы обновленного массива в консоль.
 */

public class Task_1 {

    //Запись в одномерный массив типа String всех элементов массивов переданных в параметры.
    public static String[] abc(String[]... array) { //Создание метода с параметром varargs массива String.
        int length = 0; //Вспомогательная переменная для записи сумм длин всех одномерных массивов из параметров метода.
        for (String[] arrayTemp : array) { //Элементом двумерного массива array являются массив arrayTemp.
            length += arrayTemp.length; //Сумма длин всех одномерных массивов из параметров метода.
        }
        String[] target = new String[length]; //Создание одномерного массива target имеющего длину length.
        int count = 0; //Вспомогательная переменная для записи индексов элементов одномерных массивов из параметров метода.
        for (String[] arrayTemp : array) { //Элементом двумерного массива array являются массив arrayTemp.
            for (String s : arrayTemp) { //Элементом одномерного массива arrayTemp является переменная s.
                target[count] = s; //Присваивание каждому элементу массива target значения переменной s.
                count++; //Увеличение переменной count (индекс каждого последующего элемента массива target) на 1.
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(
                new String[]{"Зеленый", "Синий", "Фиолетовый"},
                new String[]{"Черный", "Коричневый", "Красный", "Белый"}
        ); //Создание массива target c вызовом метода abc имеющим параметр состоящий из двух одномерных массивов.

        //Сравнение элементов массивов из параметра метода abc и command line параметра.
        for (String s : args) { //Внешний цикл делает повторения по каждому элементу массива args.
            for (int i = 0; i < target.length; i++) { //Внутренний цикл делает повторения по каждому элементу массива target.
                if (s.equals(target[i])) { //Сравнение элементов массива args и массива target.
                    target[i] = null; //Если элементы равны, то элемент массива target приравнивается к null.
                }
            }
        }

        //Вывод в консоль значения массива target.
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
