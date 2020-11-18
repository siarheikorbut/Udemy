package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_24;

public class Lion extends Mammal {
    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Лев - это не самая быстрая кошка!");
    }

    @Override
    void eat() {
        System.out.println("Лев, как любой хищник, любит мясо!");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня, лев спит!");
    }
}
