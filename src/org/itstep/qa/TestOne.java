package org.itstep.qa;

import java.util.Scanner;

public class TestOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Задача 3/ Составить программу, которая определит, является ли треугольник с заданными
        сторонами равносторонним, равнобедренным или разносторонним. */
        int i;
        int d;
        int a;
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        d = scanner.nextInt();
        a = scanner.nextInt();
        if (i + d > a && d + a > i && i + a > d) {
            if (i == d && d == a && a == d)
                System.out.println("Треугольник равносторонний");

            else {
                if (i == d || d == a || a == i)
                    System.out.println("Треугольник равнобедренный");

                else System.out.println("Треугольник разносторониий");
            }
        } else System.out.println("Это не треугольник");


    }
}
