package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_24;

public class Xiphophorus extends Fish {
    public Xiphophorus(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    }

    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, она ест обычный рыбий корм!");
    }
}
