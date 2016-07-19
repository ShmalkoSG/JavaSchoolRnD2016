package ru.sbertech.test.Lesson1.HomeWork; /**
 * Created by svetlanashmalko on 13.07.16.
 */
/**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2009 {
    public static void main(String[] args){
        System.out.println("Введите длину последовательности ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите последовательность через пробел ");
        Scanner om = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = om.nextInt();
        }
        int sum=0;
        int k=0;
        int m=0;
        for (int i=0;i<n;i++){
            k=(int)Math.pow(2,i);
            if (k<=n){sum=sum +a[k-1];
            m=m+1;}
            }
        System.out.println("Количество  "+m+"; сумма "+sum);

    }


    }
