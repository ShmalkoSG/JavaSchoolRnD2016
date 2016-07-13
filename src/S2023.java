/**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class  S2023 {

    public static void main(String[] args) {

        System.out.println("Введите количество элементов в массиве а ");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        System.out.println("Введите элементы массива через пробел ");
        Scanner in = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Введите количество элементов в массиве b ");
        Scanner om = new Scanner(System.in);
        int m = om.nextInt();
        System.out.println("Введите элементы массива через пробел ");
        Scanner im = new Scanner(System.in);
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = im.nextInt();
        }
        int[] c=new int[a.length];
        int k=0;
        for (int i=0;i<a.length; i++){
            for (int j=0;j<b.length; j++){
                if (a[i]==b[j]) {
                    c[k]=a[i];
                    k=k+1;
                }

            }
        }

        System.out.println("Количество совпадающих элементов "+k);
        for (int l = 0; l <k; l++) {
            System.out.print(a[l]);


    }
}}