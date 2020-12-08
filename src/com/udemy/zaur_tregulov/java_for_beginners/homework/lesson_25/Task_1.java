package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_25;

/**
 * @author Siarhei Korbut
 * 1. Создать 2 класса выбрасывающих исключения:
 * Первый класс пусть является дочерним классом класса RuntimeException и называется
 * NotMeatException; в нём создать конструктор, который принимает 1 String параметр и
 * передаёт его конструктору super класса.
 * Второй класс пусть является дочерним классом класса Exception и называется NotWaterException;
 * в нём создать конструктор, который принимает 1 String параметр и передаёт его конструктору
 * super класса.
 * 2. Создать класс Tiger. Первый метод класса - метод eat должен иметь return type void и
 * принимать 1 String параметр. Если данный параметр не равен String-у “мясо”, то метод
 * должен выбрасывать объект NotMeatException с параметром "Тигр не ест " + параметр
 * метода. Если данный параметр равен String-у “мясо”, то в консоль должно выводится “Тигр ест
 * мясо”. Второй метод класса - метод drink должен иметь return type void и принимать 1 String
 * параметр. Если данный параметр не равен String-у “вода”, то метод должен выбрасываеть
 * объект NotWaterException с параметром "Тигр не пьёт " + параметр метода. Если данный
 * параметр равен String-у “вода”, то в консоль должно выводится “Тигр пьёт воду”.
 * 3. В классе Task_1 внутри метода main создать объект класса Tiger. Вызовать метод eat с
 * параметром "мясо".
 * Затем в блоке try вызовать метод drink с параметром "вода". В данном
 * блоке try создать ещё один блок try, где вызовать метод drink с параметром "пиво".
 * Во внутреннем блоке try должен размещаются блок catch, который должен ловить исключения типа
 * Exception и в своем теле выводить в консоль мессаж данного исключения, а так же блок catch,
 * который должен ловить исключения типа NotWaterException и в своем теле выводить в консоль мессаж
 * данного исключения, блок finally, внутреннего блока try, должен в своем теле выводить в консоль
 * "This is inner finally block".
 * К внешнему try блоку должен относяться блок catch, который должен ловить исключения типа
 * Exception и в своем теле выводить в консоль мессаж данного исключения, а так же блок catch,
 * который должен ловить исключения типа RuntimeException и в своем теле выводить в консоль мессаж
 * данного исключения.
 */

public class Task_1 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("мясо");
        try {
            tiger.drink("вода");
            try {
                tiger.drink("пиво");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}