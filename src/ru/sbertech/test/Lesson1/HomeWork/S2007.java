package ru.sbertech.test.Lesson1.HomeWork; /**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2007 {
    public static void main(String[] args){
        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k=0;
        while(n%2==0){
            k=k+1;
            n=n/2;
        }

        System.out.println("В двоичном коде оканчивается на "+k+" нуля");

    }
}