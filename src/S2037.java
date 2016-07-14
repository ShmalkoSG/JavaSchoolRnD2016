import java.util.Scanner;

/**
 * Created by svetlanashmalko on 13.07.16.
 */
public class S2037 {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner in = new Scanner(System.in);
        String a;
        String b="";
        a = in.nextLine();
        System.out.println("Введите  длину слов ");
        Scanner on = new Scanner(System.in);
        int n = on.nextInt();
        int nachalo = 0;
        int konec=0;
        while (konec < a.length()) {
            nachalo=nachalo+konec;
            konec = a.indexOf(",", nachalo+1);
            if (konec<0) konec=a.length();
            if ((konec - nachalo) <= n) {
                b = b + a.substring(nachalo, konec);
            }
        }
        System.out.println(b);
    }
}