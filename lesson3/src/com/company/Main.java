package com.company;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {11, 20.8, 2.1, 28.5, 35, 53,10,45,37,-45,44,4,10,20 };
        double sum = 0;
        for (double x: numbers) {
            sum += x;
        }
        System.out.print("среднее арифметическое чисел равно: " + sum/numbers.length);
    }
}







