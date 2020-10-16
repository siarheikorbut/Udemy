package com.udemy.zaur_tregulov.course_1.homework.lesson_9.lesson_9_2;

/**
 * @author Siarhei Korbut
 * 1. Вычислить Output данной програмы.
 */

public class Test_1 {
    int a = 1;
//    static int a = 2; Невозможно создать переменную с именем a.
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test_1 t = new Test_1();
        t.abc((int) (Math.random() * 100));
    }
}
