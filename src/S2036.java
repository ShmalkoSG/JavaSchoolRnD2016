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
        String[] a = new String[n];
        char[] b = {'a', 'o', 'y', 'i', 'e', 'u'};
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        for (int i = 0; i < a.length; i++) {
            int kol = 0;
            for (int k = 0; k < a[i].length(); k++) {
               if (kol<3){
                   boolean m = true;
                   for (int j = 0; j < b.length; j++) {
                    if (a[i].charAt(k) == b[j]) m = false;
                   }
                if (m == false) kol=kol+1;
                else kol=0;
            }}
            if(kol<3) System.out.println(a[i]);
        }
    }
}


