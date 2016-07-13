import java.util.Scanner;

/**
 * Created by svetlanashmalko on 12.07.16.
 */
public class S2002 {
    public static void main(String[] args){
        int sum=0;
        System.out.println("Введите количество элементов в массиве");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        System.out.println("Введите элементы массива через пробел ");
        Scanner in = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i=0; i<5;i++) {
            sum=sum+a[i];
        }

        System.out.println("Сумма всех элементов массива "+sum);

    }
}
