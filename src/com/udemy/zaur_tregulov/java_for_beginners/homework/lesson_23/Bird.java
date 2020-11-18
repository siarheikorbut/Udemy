package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_23;

public abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " поёт!");
    }
}
