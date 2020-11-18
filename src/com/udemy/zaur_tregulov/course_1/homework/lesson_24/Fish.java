package com.udemy.zaur_tregulov.course_1.homework.lesson_24;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы!");
    }

    abstract void swim();
}