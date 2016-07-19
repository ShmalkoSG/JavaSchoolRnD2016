package ru.sbertech.test.Lesson1.HomeWork; /**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2004 {
    public static void main(String[] args){
        System.out.println("Введите год");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        byte b;
        if ((a%4)==0) {
            if ((a%100)==0) {
              if ((a%400)==0) b=1;
            else b=0;}
            else b=1;
        }
        else b=0;

        if (b==0) System.out.print(b+" год невисокосный");
        else System.out.print(b+" год високосный");
    }
}
