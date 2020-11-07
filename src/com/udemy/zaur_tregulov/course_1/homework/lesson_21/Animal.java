package com.udemy.zaur_tregulov.course_1.homework.lesson_21;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с именем Animal. При вызове конструктора этого класса
 * в консоль должно выводится "I am animal". В классе должно быть поле
 * eyes (характеризующее количество глаз), метод eat (выводящий в консоль
 * "Animal eats") и метод drink (выводящий в консоль "Animal drinks").
 * <p>
 * 2. Создать унаследованный от Animal класс с именем Pet. При вызове
 * конструктора этого класса в консоль должно выводится "I am pet". Полю
 * eyes придать значение 2. Также в классе должно быть поле name, поле
 * tail (характеризующее количество хвостов со значением 1), поле paw
 * (характеризующее количество лап со значением 4), метод run (выводящий
 * в консоль "Pet runs") и метод jump (выводящий в консоль "Pet jumps").
 * <p>
 * 3. Создать унаследованный от Pet класс с именем Dog. При вызове
 * конструктора с параметром этого класса, который будет передавать имя,
 * в консоль должно выводится "I am dog and my name is: " + имя питомца.
 * Также в классе должен быть метод play (выводящий в консоль "Dog plays").
 * <p>
 * 4. Создать унаследованный от Pet класс с именем Cat. При вызове
 * конструктора с параметром этого класса, который будет передавать имя,
 * в консоль должно выводится "I am cat and my name is: " + имя питомца.
 * Также в классе должен быть метод sleep (выводящий в консоль "Cat sleeps").
 * <p>
 * 5. Создать класс с именем Test. В методе main вывести в консоль количество
 * лап экземпляра класса Dog и вызвать метод sleep экземпляра класса Cat.
 */

public class Animal {

    public Animal() {
        System.out.println("I am animal");
    }

    int eyes;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {

    public Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        System.out.println("Dog number of paws: " + dog.paw);

        Cat cat = new Cat("Mura");
        cat.sleep();

    }
}