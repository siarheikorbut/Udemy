package com.udemy.zaur_tregulov.course_1.homework.lesson_7;

/**
 * @author Siarhei Korbut
 * Создать класс Employee с атрибутами id, name, surname, age, salary и department. Переменная salary должна
 * быть недоступна вне класса, переменные name и surname должны быть доступны отовсюду, а переменная id
 * должна быть видна только внутри пакета.
 * Создать три public метода, которые будут выводить в консоль значения созданных переменных.
 * Создать для этого класса три разных конструктора с public, default и private access modifire-ами. В
 * конструкторах присвоить переменным класса значения из параметров
 * Создать новые тестовые классы в этом же и другом пакете, и создать в них экземпляры класса Employee.
 * Вывести в консоль значения переменных созданных экземпляров с помощью метода printl и методов самого
 * класса.
 */

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee(int id) {
        this.id = id;
    }

    public Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void getID() {
        System.out.println("ID: " + id);
    }

    public void getSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void getSalary() {
        System.out.println("Заработная плата: " + salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
    }
}
