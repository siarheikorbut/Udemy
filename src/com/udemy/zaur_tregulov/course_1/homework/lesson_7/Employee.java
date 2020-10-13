package com.udemy.zaur_tregulov.course_1.homework.lesson_7;

/**
 * @author Siarhei Korbut
 * Создать класс Employee и атрибутами id, name, surname, age, salary и department. Переменная salary должна быть
 * недоступна вне класса, переменные name и surname должны быть доступны отовсюду, а переменная id должна быть видна
 * только внутри пакета. Создать три public метода, которые будут выводить в консоль значения созданных переменных.
 * Создать для этого класса три разных конструктора с public, default и private access modifire-ами. В конструкторах
 * присвоить переменным класса значения из параметров. Создать новые тестовые классы в этом же и другом пакете, и
 * создать в них экземпляры класса Employee. Вывести в консоль значения переменных созданных экземпляров с помощью
 * метода printl и методов самого класса.
 */

public class Employee {
    protected int id;
    public String name;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String name, String surname, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
    }
}
