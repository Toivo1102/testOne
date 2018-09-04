package org.itstep.qa;

import java.util.Scanner;

public class Players {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* Задача 4
       Три шахматиста играют в шахматы. Известно количество очков, набранных каждым из них.
       Составить программу, которая определит, на сколько очков победитель оторвался
       от самого слабого игрока.*/
        int i;
        int d;
        int a;
        System.out.println("Введите целое число");
        i = scanner.nextInt();
        d = scanner.nextInt();
        a = scanner.nextInt();
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
        }

    }
}