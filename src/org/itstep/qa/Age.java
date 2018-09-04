package org.itstep.qa;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        /* Задача 5
        Составить программу, которая вводит число, обозначающее количество лет,
         и выводит для этого числа наименование «год», «года» или «лет».
         Например, «14 лет», «183 года», «31 год».
       */

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Введите целое число");
        a = scanner.nextInt();
        b = a % 100;
        if (b >= 11 && b <= 14) System.out.println(a + " лет");
        else {
            if (a % 10 == 1) System.out.println(a + " год");
            else {
                if (a % 10 > 1 && a % 10 < 5) System.out.println(a + " года");
                else System.out.println(a + " лет");
            }
        }
    }
}

