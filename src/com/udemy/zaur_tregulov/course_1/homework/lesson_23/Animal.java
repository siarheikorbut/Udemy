package com.udemy.zaur_tregulov.course_1.homework.lesson_23;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}