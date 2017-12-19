package com.test;

public class Main {

    public static void main(String[] args) {
        boolean sequntialBlehLaunches = false;
        boolean concurrentBlehLaunches = true;

        if(sequntialBlehLaunches) {
            for (int i = 1; i<= 5; i++) {
                Fibonacci fibonacci = new Fibonacci(5, 12);
                fibonacci.run();

            }
            System.out.println("You sigh in relief :)");

        }

        if (concurrentBlehLaunches) {

            for (int i =1; i <= 1; i++) {
                Runnable fibonacci = new Fibonacci(20000,10000);
                Thread thread = new Thread(fibonacci);
                thread.start();
            }
            System.out.println("You gave an relief Bleh nicely :)");
        }


    }
}
