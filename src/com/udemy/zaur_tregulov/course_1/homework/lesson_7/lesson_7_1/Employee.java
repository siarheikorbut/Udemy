package com.udemy.zaur_tregulov.course_1.homework.lesson_7.lesson_7_1;

/**
 * @author Siarhei Korbut
 * 1. Создать класс Employee с атрибутами id, surname, age, salary и department. Переменная
 * salary должна быть недоступна вне класса, переменная surname должна быть доступна отовсюду,
 * а переменная id должна быть видна только внутри пакета.
 * 2. Создать три public метода, которые будут выводить в консоль значения созданных переменных
 * id, surname и salary.
 * 3. Создать для этого класса три разных конструктора с public, default и private access
 * modifier-ами. В конструкторах присвоить переменным класса значения из параметров.
 * 4. Создать новые тестовые классы в этом же и другом пакете, и создать в них экземпляры класса
 * Employee.
 * 5. Вывести в консоль значения переменных созданных экземпляров с помощью метода printl и методов
 * самого класса.
 */

public class Employee {
    int id;
    //    String name; Поле не используется.
    public String surname;
    //    int age; Поле не используется.
    private double salary;
//    String department; Поле не используется.

    //Создание default access modifier конструктора.
    Employee(int id) {
        this.id = id;
    }

    //Создание public access modifier конструктора.
    public Employee(String surname) {
        this.surname = surname;
    }

    //Создание private access modifier конструктора.
    private Employee(double salary) {
        this.salary = salary;
    }

    //Создание public метода для вывода в консоль.
    public void printID() {
        System.out.println("ID: " + id);
    }

    //Создание public метода для вывода в консоль.
    public void printSurname() {
        System.out.println("Фамилия: " + surname);
    }

    //Создание public метода для вывода в консоль.
    public void printSalary() {
        System.out.println("Заработная плата: " + salary);
    }
}

class EmployeeTest_1 {
    public static void main(String[] args) {

        //Создание обьектов класса Employee
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee("Андрей");
//        Employee employee3 = new Employee(750.53); Невозможно создать обьект employee3.

        System.out.println(employee1.id);
        System.out.println(employee1.surname);
//        System.out.println(employee1.salary); Невозможно вызвать метод println обьекта employee1 с параметром salary.

        System.out.println(employee2.id);
        System.out.println(employee2.surname);
//        System.out.println(employee2.salary); Невозможно вызвать метод println обьекта employee2 с параметром salary.

        employee1.printID();
        employee1.printSurname();
        employee1.printSalary();

        employee2.printID();
        employee2.printSurname();
        employee2.printSalary();
    }
}
