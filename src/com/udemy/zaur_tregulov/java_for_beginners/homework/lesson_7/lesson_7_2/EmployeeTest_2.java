package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_7.lesson_7_2;

import com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_7.lesson_7_1.Employee;

public class EmployeeTest_2 {
    public static void main(String[] args) {
//        Employee employee1 = new Employee(1); Невозможно создать обьект employee1.
        Employee employee2 = new Employee("Андрей");
//        Employee employee3 = new Employee(750.53); Невозможно создать обьект employee3.

        System.out.println(employee2.surname);

        employee2.printID();
        employee2.printSurname();
        employee2.printSalary();
    }
}