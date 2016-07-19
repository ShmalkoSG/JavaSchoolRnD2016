package ru.sbertech.test.Lesson1.HomeWork;

import java.util.Scanner;

/**
 * Created by svetlanashmalko on 13.07.16.
 */
public class S2036 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк ");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        System.out.println("Введите строки ");
        Scanner in = new Scanner(System.in);
        String[] a =new String[n];
        String[] b =new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
//        for (int i=0;i<a.length;i++){
//            for (int k=0;k<a[i].length();k++){
//                if (a[i]="a")
//            }
//
//        }
    }

}
