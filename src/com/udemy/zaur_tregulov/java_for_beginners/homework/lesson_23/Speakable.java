package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_23;

public interface Speakable {
    default void speak(){
        System.out.println("Кто-то говорит!");
    }
}
