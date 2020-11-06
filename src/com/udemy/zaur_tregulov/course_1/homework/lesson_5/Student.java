package com.udemy.zaur_tregulov.course_1.homework.lesson_5;

/**
 * @author Siarhei Korbut
 * 1. Создать два класса. 1-ый назовать Student. Он должен содержать в себе следующие атрибуты:
 * номер студенческого билета, имя, фамилию, год обучения, среднюю оценку по математике,
 * среднюю оценку по экономике, среднюю оценку по иностранному языку.
 * 2. Второй класс назвать StudentTest. В нём необходимо создать метод для вычисления средней
 * арифметической оценки по трем предметам.
 * 3. Создать три разных обьекта класса Student и продемонстрировать на них работу созданного метода.
 */

public class Student {
    int studentID;
    String name;
    String surname;
    int yearOfStudy;
    double mathsAverageScore;
    double economicAverageScore;
    double foreignLanguageAverageMark;

    public Student(
            int studentID,
            String name,
            String surname,
            int yearOfStudy,
            double mathsAverageScore,
            double economicAverageScore,
            double foreignLanguageAverageMark
    ) {
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
    void sumAverageMark(Student student) {
        double result = Math.round(((
                student.mathsAverageScore +
                        student.economicAverageScore +
                        student.foreignLanguageAverageMark) / 3) * 100.0) / 100.0;
        System.out.println(student.name + " " + student.surname + ": средняя арифметическая оценка = " + result);
    }

    public static void main(String[] args) {
        Student student1 = new Student(
                1,
                "Иван",
                "Иванов",
                2000,
                6.4,
                7.3,
                8.5
        );
        Student student2 = new Student(
                2,
                "Петр",
                "Петров",
                2000,
                9.0,
                8.9,
                10.0);
        Student student3 = new Student(
                3,
                "Сидор",
                "Сидоров",
                2000,
                5.6,
                4.8,
                5.9
        );

        StudentTest st = new StudentTest();
        st.sumAverageMark(student1);
        st.sumAverageMark(student2);
        st.sumAverageMark(student3);
    }
}