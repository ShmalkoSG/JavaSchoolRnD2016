/**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2008 {
    public static void main(String[] args){
        System.out.println("Введите длину последовательности ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Введите максимальную сумму ");
        Scanner on = new Scanner(System.in);
        int w = on.nextInt();
        System.out.println("Введите последовательность через пробел ");
        Scanner om = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = om.nextInt();
        }
        int sum=0;
        int k=0;
        for (int i=0;i<n;i++){
            if((sum+a[i])<=w) {
            sum=sum+a[i];
            k=k+1;
            }
        }

        System.out.println("Количество погруженных предметов "+k+"; суммарная масса "+sum);

    }
}

