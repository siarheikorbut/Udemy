package com.udemy.zaur_tregulov.course_1.homework.lesson_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с одним методом. Метод должен называться abc и принимать в
 * параметры N-ое количество параметров типа String. Метод должен возвращать
 * отсортированный объект класса ArrayList из неповторяющихся объектов типа
 * String взятых из параметра метода.
 * 2. Продемонстрировать работу созданного метода.
 */

public class Task_1 {

    //Добавление в коллекцию типа ArrayList элементов из параметра метода и её сортировка.
    public static List<String> abc(String... s) {
        List<String> list = new ArrayList<>();
        for (String element : s) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(abc("Белый", "Черный", "Голубой", "Зелёный", "Синий", "Фиолетовый"));
    }
}