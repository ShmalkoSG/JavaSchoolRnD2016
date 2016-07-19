package ru.sbertech.test.Lesson1.HomeWork;

import java.util.Scanner;

/**
 * Created by svetlanashmalko on 12.07.16.
 */
public class S2003 {
    public static void main(String[] args){
        int sum=0;
        System.out.println("Введите количество элементов последоваетельности");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        System.out.println("Введите элементы последовательности через пробел ");
        Scanner in = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();}
        for (int i=0; i<5;i++) {
            if ((i%2)==0) {sum=sum+a[i];
            }
            else{
                sum = sum - a[i];
            }
        }

        System.out.println("Сумма по заданным параметрам "+sum);

    }
}
