package com.udemy.zaur_tregulov.course_1.homework.lesson_23;

public interface Speakable {
    default void speak(){
        System.out.println("Кто-то говорит!");
    }
}