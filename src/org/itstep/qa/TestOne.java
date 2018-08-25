package org.itstep.qa;

import java.util.Scanner;

public class TestOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   /* int i = 99;
        System.out.println(i);
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        System.out.println(i);
        int i = 1;
        int j = 3;
        float f = 3f;
        char ch = '3';

        System.out.println(i == j);

        System.out.println(i != j);

        System.out.println(f == j); // true, показывает, что правда

        System.out.println(ch == j); //  false - Ошибка так как разные типы данных
        System.out.println((f == j) & (ch == f));
        System.out.println(!(f == j));
        System.out.println(!((f == j) | (ch == f)));
        int i;
        int d;
        int a;
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        d = scanner.nextInt();
        a = scanner.nextInt(); */
        // System.out.println(i > d ? "Больше число i" : i == d ? "Числа равны" : "Больше число d");

       /* Составить программу, которая определит, является ли треугольник с заданными
        сторонами равносторонним, равнобедренным или разносторонним. */

       /* if (i + d > a & d + a > i & i + a > d) {
            if (i == d & d == a & a == d)
                System.out.println("Треугольник равносторонний");

            else {
                if (i == d | d == a | a == i)
                    System.out.println("Треугольник равнобедренный");

                else System.out.println("Треугольник разносторониий");
            }
        } else System.out.println("Это не треугольник");*/

       /*Три шахматиста играют в шахматы. Известно количество очков, набранных каждым из них.
       Составить программу, которая определит, на сколько очков победитель оторвался от самого слабого игрока.


        if (i == d & i == a & d == a) System.out.println("Победителя нет");
        else {
            if (i >= d & i >= a) {
                if (i - d > i - a) System.out.println(i - d);
                else System.out.println(i - a);
            } else if (d >= i & d >= a) {
                if (d - i > d - a) System.out.println(d - i);
                else System.out.println(d - a);
            } else if (a - d > a - i) System.out.println(a - d);
            else System.out.println(a - i);
        }*/

      /*
        Составить программу, которая вводит число, обозначающее количество лет,
         и выводит для этого числа наименование «год», «года» или «лет».
         Например, «14 лет», «183 года», «31 год».
       */

        int a;
        int b;
        System.out.println("Введите целое число");
        a = scanner.nextInt();
        b = a % 10;
        if (a < 10) if (a == 1) System.out.println(a + " год");
        else {
            if (a == 0 | a == 5 | a == 6 | a == 8 | a == 9) System.out.println(a + " лет");
            else System.out.println(a + " года");
        }

        else if (a >= 10 & a <= 20) System.out.println(a + " лет");
        else if (b < 10) if (b == 1) System.out.println(a + " год");
        else {
            if (b == 2 | b == 3 | b == 4) System.out.println(a + " года");
            else System.out.println(a + " лет");
        }

    }
}
