package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_5;

/**
 * @author Siarhei Korbut
 * 1. Создать 2 класса. Первый класс с названием BankAccount, должен содержать в
 * себе ID клиента, имя, фамилию и баланс счёта и 2 метода.
 * 2. Первый метод, с названием popolnenieScheta, должен увеличивать баланс на сумму
 * указанную в параметрах этого метода.
 * 3. Второй метод, с названием snytieSoScheta, должен уменьшать баланс на сумму
 * указанную в параметрах этого метода.
 * 4. Второй класс с названием BankAccountTest, должен создавать экземпляр класса
 * BankAccount и вызывать созданные в нем методы, продемонстрировав результат их
 * работы.
 */

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


    public void popolnenieScheta(double summaPopolneniya) {
        System.out.printf("""
                        ID клиента: %d
                        Имя: %s
                        Фамилия: %s
                        Баланс: %.2f
                        Сумма пополнения: %.2f
                        Баланс после поплнения: %.2f

                        """,
                id,
                name,
                surname,
                balance,
                summaPopolneniya,
                balance + summaPopolneniya
        );
    }

    public void snytieSoScheta(double summaSnytiya) {
        if (balance - summaSnytiya < 0) {
            System.out.printf("""
                            ID клиента: %d
                            Имя: %s
                            Фамилия: %s
                            Баланс: %.2f
                            Сумма снятия: %.2f

                            Недостаточно средств!

                            """,
                    id,
                    name,
                    surname,
                    balance,
                    summaSnytiya);
        } else {
            System.out.printf("""
                            ID клиента: %d
                            Имя: %s
                            Фамилия: %s
                            Баланс: %.2f
                            Сумма снятия: %.2f
                            Баланс после снятия: %.2f

                            """,
                    id,
                    name,
                    surname,
                    balance, summaSnytiya,
                    balance - summaSnytiya
            );
        }
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount(1, "Иван", "Иванов", 100);
        user1.popolnenieScheta(300);
        user1.snytieSoScheta(450);
    }
}
