package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Siarhei Korbut
 * 1. Создать класс Student. Он должен содержать в себе следующие атрибуты: имя, курс и среднюю
 * оценку.
 * 2. Создать конструктор для этого класса.
 * 3. Создать класс StudentTest с двумя методами которые принимают в параметры 2 объекта класса
 * Student. Первый метод должен сравнивать двух студентов используя один if statement и
 * логические операторы внутри него и выводить в консоль информацию о том, равны ли объекты.
 * Второй метод должен сравнивать все атрибуты объектов по отдельности использовать nested if
 * statement и выводить в консоль информацию о том, равны ли объекты, а если объекты не равны,
 * то в чём именно было обнаружено первое неравенство.
 * 4. Продемонстрировать работу созданных методов.
 */

public class Student {
    public String name;
    public int course;
    public double averageGrade;

    public Student(String name, int course, double averageGrade) {
        this.name = name;
        this.course = course;
        this.averageGrade = averageGrade;
    }
}

class StudentTest {

    //Сравнение объектов класса Student.
    void comparisonStudents(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.averageGrade == st2.averageGrade) {
            System.out.println("Студент " + st1.name + " равен студенту " + st2.name);
        } else {
            System.out.println("Студент " + st1.name + " не равен студенту " + st2.name);
        }
    }

    //Сравнение атрибутов объектов класса Student.
    void comparingStudentAttributes(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            System.out.println("Студенты " + st1.name + " и " + st2.name + " имеют одинаковые имена");
            if (st1.course == st2.course) {
                System.out.println("Студенты " + st1.name + " и " + st2.name + " учатся на одном курсе");
                if (st1.averageGrade == st2.averageGrade) {
                    System.out.println("Студенты " + st1.name + " и " + st2.name + " имеют одинаковую среднюю оценку");
                } else {
                    System.out.println("Студенты " + st1.name + " и " + st2.name + " имеют разную среднюю оценку");
                }
            } else {
                System.out.println("Студенты " + st1.name + " и " + st2.name + " учатся на разных курсах");
            }
        } else {
            System.out.println("Студенты " + st1.name + " и " + st2.name + " имеют разные имена");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StudentTest st = new StudentTest();

        Student student1 = new Student(reader.readLine(), (int) (Math.random() * 5), Math.random() * 10);
        Student student2 = new Student(reader.readLine(), (int) (Math.random() * 5), Math.random() * 10);

        st.comparisonStudents(student1, student2);
        st.comparingStudentAttributes(student1, student2);
    }
}
