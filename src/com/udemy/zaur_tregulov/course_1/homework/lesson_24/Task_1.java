package com.udemy.zaur_tregulov.course_1.homework.lesson_24;

/**
 * @author Siarhei Korbut
 * 1. Скопировать содержимое пакета lesson_23 в пакет lesson_24. В классе
 * Task_1 изменить метод main.
 * 2. Создать в методе mail два массива типа Speakable и Animal, которые
 * будут содержать все возможные ссылочные переменные, ссылающиеся на все
 * возможные экземпляры.
 * 3. Используя if и instanceOf проверить на какой экземпляр ссылается
 * переменная и вывести в консоль соответствующие переменные данного
 * экземпляра и вызвать его методы.
 */

public class Task_1 {
    public static void main(String[] args) {
        Animal a1 = new Lion("Кузя");
        Animal a2 = new Penguin("Шарик");
        Animal a3 = new Xiphophorus("Жорж");

        Bird b1 = new Penguin("Шарик");
        Fish f1 = new Xiphophorus("Жорж");
        Mammal m1 = new Lion("Кузя");

        Lion l1 = new Lion("Кузя");
        Penguin p1 = new Penguin("Шарик");
        Xiphophorus x1 = new Xiphophorus("Жорж");

        Speakable s1 = new Lion("Кузя");
        Speakable s2 = new Penguin("Шарик");

        Speakable[] arraySpeakable = {s1, s2, b1, m1, l1, p1};
        Animal[] arrayAnimals = {a1, a2, a3, b1, f1, m1, l1, p1, x1};

        for (Speakable s : arraySpeakable) {
            if (s instanceof Penguin) {
                Penguin penguin = (Penguin) s;
                System.out.println(penguin.name);
                penguin.speak();
                penguin.sleep();
                penguin.fly();
                penguin.eat();
            } else if (s instanceof Lion) {
                Lion lion = (Lion) s;
                System.out.println(lion.name);
                lion.speak();
                lion.run();
                lion.sleep();
                lion.eat();
            }
        }

        System.out.println("------------------------------------------------");

        for (Animal a : arrayAnimals) {
            if (a instanceof Lion) {
                Lion lion = (Lion) a;
                System.out.println(lion.name);
                lion.eat();
                lion.sleep();
                lion.run();
                lion.speak();
            } else if (a instanceof Penguin) {
                Penguin penguin = (Penguin) a;
                System.out.println(penguin.name);
                penguin.eat();
                penguin.fly();
                penguin.sleep();
                penguin.speak();
            } else if (a instanceof Xiphophorus) {
                Xiphophorus xiphophorus = (Xiphophorus) a;
                System.out.println(xiphophorus.name);
                xiphophorus.eat();
                xiphophorus.swim();
                xiphophorus.sleep();
            }
        }
    }
}