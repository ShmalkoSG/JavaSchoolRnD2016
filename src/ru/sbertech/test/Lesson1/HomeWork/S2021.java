package ru.sbertech.test.Lesson1.HomeWork; /**
 * Created by svetlanashmalko on 13.07.16.
 */

import java.util.Scanner;

public class  S2021 {

    public static void main(String[] args) {

        System.out.println("Введите длину последовательности ");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        System.out.println("Введите последовательность через пробел ");
        Scanner in = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int k = 0; k < 2; k++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > max) max = a[i];
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == max) a[i] = (int) Math.round(a[i] / 2);
            }

        }
        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m]);
        }

    }
}