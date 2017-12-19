package com.test;

public class Fibonacci implements Runnable {
    int num1;
    int num2;
    int deh;
    boolean geh;

    Fibonacci(int number1, int number2 ) {
        num1 = number1;
        num2 = number2;
        deh = 5 + (int)(Math.random() *10);
        geh = (deh == 0);
    }

    private void fleh() {
        System.out.print(num1 + " ");


        for (int i = 1; i <= 10; i++) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num1 + " ");
        }
        System.out.println(" ");


    }

    public void run() {
        fleh();
    }
}
