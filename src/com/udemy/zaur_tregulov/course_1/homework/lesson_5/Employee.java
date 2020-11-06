package com.udemy.zaur_tregulov.course_1.homework.lesson_5;

/**
 * @author Siarhei Korbut
 * 1. Создать два класса. Первый с названием Employee и атрибутами id, name, surname, age, salary,
 * department, которые должны задаваться в конструкторе.
 * 2. В этом же классе создать метод увеличения заработной платы.
 * 3. Второй класс с названием EmployeeTest, в котором создать два обьекта класса Employee. При
 * помощи созданного метода увеличить заработную плату каждого работника вдвое и вывести в
 * консоль значение новой заработной платы.
 */

public class Employee {
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String name, String surname, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void salaryUp() {
        double newSalary = salary * 2;
        System.out.printf("""
                        ID работника: %d
                        Имя: %s
                        Фамилия: %s
                        Возраст: %d
                        Отдел: %s
                        Заработная плата: %.2f
                        Новая заработная плата: %.2f

                        """,
                id,
                name,
                surname,
                age,
                department,
                salary,
                newSalary
        );
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(
                1,
                "Иван",
                "Иванов",
                34,
                1000,
                "Java разработка"
        );
        Employee employee2 = new Employee(
                2,
                "Сергей",
                "Сергеев",
                23,
                700,
                "Тестирование"
        );

        employee1.salaryUp();
        employee2.salaryUp();
    }
}
