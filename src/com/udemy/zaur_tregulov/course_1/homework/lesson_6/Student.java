package com.udemy.zaur_tregulov.course_1.homework.lesson_6;

/**
 * @author Siarhei Korbut
 * 1. Создать класс Student. Он должен содержать в себе следующие атрибуты: номер студенческого
 *    билета, имя, фамилию, год обучения, среднюю оценку по математике,
 *    среднюю оценку по экономике, среднюю оценку по иностранному языку.
 * 2. Создать три конструктора для этого класса. 1-ый конструктор должен принимать в себя все
 *    параметры, 2-ой только номер студенческого билета, имя, фамилию, и год обучения, 3-ий не
 *    должен принимать значений вообще.
 * 3. Продемонстрировать работу созданных конструкторов в тестовом классе.
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

    public Student(int studentID, String name, String surname, int yearOfStudy) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.yearOfStudy = yearOfStudy;
    }

    public Student() {
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(
                1,
                "Иван",
                "Иванов",
                2000,
                4.5,
                7.6,
                5.7);
        Student student2 = new Student(
                2,
                "Никита",
                "Беляев",
                2004);
        Student student3 = new Student();

        System.out.printf("Номер студенческого билета: %d\n" +
                "Имя: %s\n" +
                "Фамилия: %s\n" +
                "Год обучения: %d\n" +
                "Средняя оценка по математике: %.2f\n" +
                "Средняя оценка по экономике: %.2f\n" +
                "Средняя оценка по иностранному языку: %.2f\n\n",
                student1.studentID,
                student1.name,
                student1.surname,
                student1.yearOfStudy,
                student1.mathsAverageScore,
                student1.economicAverageScore,
                student1.foreignLanguageAverageMark);
        System.out.printf("Номер студенческого билета: %d\n" +
                "Имя: %s\n" +
                "Фамилия: %s\n" +
                "Год обучения: %d\n" +
                "Средняя оценка по математике: %.2f\n" +
                "Средняя оценка по экономике: %.2f\n" +
                "Средняя оценка по иностранному языку: %.2f\n\n",
                student2.studentID,
                student2.name,
                student2.surname,
                student2.yearOfStudy,
                student2.mathsAverageScore,
                student2.economicAverageScore,
                student2.foreignLanguageAverageMark);
        System.out.printf("Номер студенческого билета: %d\n" +
                "Имя: %s\n" +
                "Фамилия: %s\n" +
                "Год обучения: %d\n" +
                "Средняя оценка по математике: %.2f\n" +
                "Средняя оценка по экономике: %.2f\n" +
                "Средняя оценка по иностранному языку: %.2f\n\n",
                student3.studentID,
                student3.name,
                student3.surname,
                student3.yearOfStudy,
                student3.mathsAverageScore,
                student3.economicAverageScore,
                student3.foreignLanguageAverageMark);
    }
}