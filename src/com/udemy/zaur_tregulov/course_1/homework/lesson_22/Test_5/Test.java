package com.udemy.zaur_tregulov.course_1.homework.lesson_22.Test_5;

/**
 * @author Siarhei Korbut
 * 1. Каков будет результат компиляции и запуска класса Test?
 */

class X {
    String s1 = "Привет";
}

class Y extends X {
    boolean bool = false;
}

public class Test {
    public static void main(String[] args) {
        X x = new Y();
        //System.out.println(x.s1 + "" + x.bool); Из-за того, что в классе X отсутствует переменная bool, данная программа не компилируется.
    }
}