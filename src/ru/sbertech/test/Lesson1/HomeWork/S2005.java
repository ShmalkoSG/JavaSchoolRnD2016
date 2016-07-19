package ru.sbertech.test.Lesson1.HomeWork; /**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2005 {
    public static void main(String[] args){
        System.out.println("Введите количество элементов последовательности");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите последовательность через пробел ");
        Scanner on = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = on.nextInt();
        }
        int k=1;
        int min=a[0];
        for (int i=1;i<n; i++) {
            if (min>a[i]) {k=i+1; min=a[i];}
        }
        System.out.println("Минимальный элемент последовательности "+ k+" его значение "+min);
    }
}
