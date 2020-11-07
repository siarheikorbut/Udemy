package com.udemy.zaur_tregulov.course_1.homework.lesson_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Siarhei Korbut
 * 1. Создать класс с именем Student. Класс должен иметь поля: name (использовать
 * StringBuilder), course, grade. Для созданного класса приминить инкапсуляцию.
 * 2. Длина имени обьектов не должна быть менее трёх символов. Оценки должны быть
 * числами в интервале от 1 до 10. Курс должен быть числом от 1 до 4 включительно.
 * 3. Создать метод с именем showInfo. Созданный метод должен выводить всю информацию
 * о студенте, не используя поля класса напрямую.
 * 4. Создать класс с именем StudentTest. В созданном классе создать экземпляр
 * класса Student и придать его параметрам значения.
 * 5. Продемонстрировать работу метода showInfo.
 */

public class Student {

    private StringBuilder name;
    private int course = 1;
    private int grade;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public int getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 2) {
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        } else ++course;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.printf("""
                        Студент
                        Имя: %s
                        Курс: %d
                        Оценка: %d
                        """,
                getName(),
                getCourse(),
                getGrade()
        );
    }
}

class StudentTest {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Student student = new Student();
            student.setName(new StringBuilder(reader.readLine()));
            student.setCourse(((int) (Math.random() * 5)));
            student.setGrade((int) (Math.random() * 11));

            student.showInfo();
        } catch (NullPointerException | IOException e) {
            System.out.println("Имя студента короче трёх символов");
        }
    }
}