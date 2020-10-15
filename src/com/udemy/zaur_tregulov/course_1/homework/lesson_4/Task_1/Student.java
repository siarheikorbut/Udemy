package com.udemy.zaur_tregulov.course_1.homework.lesson_4.Task_1;

/**
 * @author Siarhei Korbut
 * 1. Создать два класса. 1-ый назовать Student. Он должен содержать в себе следующие атрибуты:
 *    номер студенческого билета, имя, фамилию, год обучения, среднюю оценку по математике,
 *    среднюю оценку по экономике, среднюю оценку по иностранному языку.
 * 2. Второй класс назвать StudentTest. В нём необходимо создать 3 разных обьекта класса Student
 *    и вывести в консоль в читабельном виде среднюю арифметическую оценку каждого студента
 *    (учитывая все три параметра).
 */

public class Student {
    int studentID;
    String name;
    String surname;
    int yearOfStudy;
    double mathsAverageScore;
    double economicAverageScore;
    double foreignLanguageAverageMark;

    public Student(int studentID, String name, String surname, int yearOfStudy, double mathsAverageScore, double economicAverageScore, double foreignLanguageAverageMark) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
        this.mathsAverageScore = mathsAverageScore;
        this.economicAverageScore = economicAverageScore;
        this.foreignLanguageAverageMark = foreignLanguageAverageMark;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Иван", "Иванов", 2000, 6.4, 7.3, 8.5);
        Student student2 = new Student(2, "Петр", "Петров", 2000, 9.0, 8.9, 10.0);
        Student student3 = new Student(3, "Сидор", "Сидоров", 2000, 5.6, 4.8, 5.9);

        double sumAverageMarkSt1 = (student1.mathsAverageScore + student1.economicAverageScore + student1.foreignLanguageAverageMark) / 3;
        double sumAverageMarkSt2 = (student2.mathsAverageScore + student2.economicAverageScore + student2.foreignLanguageAverageMark) / 3;
        double sumAverageMarkSt3 = (student3.mathsAverageScore + student3.economicAverageScore + student3.foreignLanguageAverageMark) / 3;

        System.out.println(student1.name + " " + student1.surname + " : средняя арифметическая оценка = " + Math.round(sumAverageMarkSt1 * 100.0) / 100.0);
        System.out.println(student2.name + " " + student2.surname + " : средняя арифметическая оценка = " + Math.round(sumAverageMarkSt2 * 100.0) / 100.0);
        System.out.println(student3.name + " " + student3.surname + " : средняя арифметическая оценка = " + Math.round(sumAverageMarkSt3 * 100.0) / 100.0);
    }
}