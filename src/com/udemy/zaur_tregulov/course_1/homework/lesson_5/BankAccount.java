package com.udemy.zaur_tregulov.course_1.homework.lesson_5;

public class BankAccount {

    int id;
    String name;
    String surname;
    double balance;

    public BankAccount(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }


    void popolnenieScheta(double summaPopolneniya) {
        System.out.printf("ID клиента: %d\nИмя: %s\nФамилия: %s\nБаланс: %.2f;\nСумма пополнения: %.2f\nБаланс после поплнения: %.2f\n\n", id, name, surname, balance, summaPopolneniya, balance + summaPopolneniya);
    }

    void snytieSoScheta(double summaSnytiya) {
        System.out.printf("ID клиента: %d\nИмя: %s\nФамилия: %s\nБаланс: %.2f;\nСумма снятия: %.2f\nБаланс после снятия: %.2f;\n\n", id, name, surname, balance, summaSnytiya, balance - summaSnytiya);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(1, "Иван", "Иванов", 100);
        user1.popolnenieScheta(300);

        BankAccount user2 = new BankAccount(2, "Петр","Петров", 2466);
        user2.snytieSoScheta(450);
    }
}