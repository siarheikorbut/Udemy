package com.udemy.zaur_tregulov.course_1.homework.lesson_10.p4.p5;

public class E {
    public static class Car {
        String brand;
        String model;
        int year;
        String color;

        public Car(String brand, String model, int year, String color) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public void showCarInfo() {
            System.out.printf(
                    """
                                                        
                            Информация об автомобиле
                            Марка: %s
                            Модель: %s
                            Год: %d                         
                            Цват: %s""",
                    brand,
                    model,
                    year,
                    color
            );
        }
    }
}
