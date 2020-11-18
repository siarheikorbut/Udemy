package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_24;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Пингвины любят есть рыбу!");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать!");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Пингвины не умеют петь как соловьи!");
    }
}
