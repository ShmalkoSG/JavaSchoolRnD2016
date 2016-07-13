/**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class  S2022 {

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
        int k=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j){
                    if (a[j]%a[i]==0) k=k+1;

                }


            }

        }

            System.out.print("Количество пар "+k);


    }
}