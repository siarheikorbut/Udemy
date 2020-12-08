package com.udemy.zaur_tregulov.java_for_beginners.homework.lesson_25;

public class Tiger {
    public void eat(String food) {
        if (!food.equals("мясо")) {
            throw new NotMeatException("Тигр не ест " + food);
        } else {
            System.out.println("Тигр ест мясо");
        }
    }

    public void drink(String liquid) throws NotWaterException {
        if (!liquid.equals("вода")){
            throw new NotWaterException("Тигр не пьёт " + liquid);
        } else {
            System.out.println("Тигр пьёт воду");
        }
    }
}