package com.company;

public class Main {

    public static void main(String[] args) {
        // Завдання 3
        String кнопка = "До низу";
        int n = 2;
        if (кнопка == "До гори") {
            if (n == 1) {
                System.out.println("Ви піднялись на 1 поверх!");
            } else if (n == 2) {
                n += 1;
                if (n == 3) {
                    System.out.println("Ви піднялись на 3 поверх!");
                }
            } else if (n == 3) {
                System.out.println("Ви піднялись на 3 поверх!");
            } else if (n == 4) {
                System.out.println("Ви піднялись на 4 поверх!");
            } else if (n == 5) {
                System.out.println("Ви піднялись на 5 поверх!");
            } else if (n == 6) {
                System.out.println("Ви піднялись на 6 поверх!");
            } else if (n == 7) {
                System.out.println("Ви піднялись на 7 поверх!");
            } else if (n == 8) {
                System.out.println("Ви піднялись на 8 поверх!");
            } else if (n == 9) {
                System.out.println("Ви піднялись на 9 поверх!");
            }
        }
        if (кнопка == "До низу") {
            if (n == 9) {
                System.out.println("Ви спустились на 9 поверх!");
            } else if (n == 8) {
                System.out.println("Ви спустились на 8 поверх!");
            } else if (n == 7) {
                System.out.println("Ви спустились на 7 поверх!");
            } else if (n == 6) {
                System.out.println("Ви спустились на 6 поверх!");
            } else if (n == 5) {
                System.out.println("Ви спустились на 5 поверх!");
            } else if (n == 4) {
                System.out.println("Ви спустились на 4 поверх!");
            } else if (n == 3) {
                System.out.println("Ви спустились на 3 поверх!");
            } else if (n == 2) {n -= 1;
                if (n == 1) {
                    System.out.println("Ви спустились на 1 поверх!");}
            }
            else if (n == 1) {System.out.println("Ви спустились на 1 поверх!");}
        }
    }
}