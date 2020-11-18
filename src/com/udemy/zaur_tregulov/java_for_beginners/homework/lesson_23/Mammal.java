package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_23;

public abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

    interface Speakable {
        default void speak() {
            System.out.println("Кто-то говорит!");
        }
    }
}