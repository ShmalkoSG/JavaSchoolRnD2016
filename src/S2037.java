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
        while ((konec+1) < a.length()) {
            if (konec>0) nachalo=konec+1;
            konec = a.indexOf(",", nachalo);
            if (konec<0) konec=a.length()-1;
            if ((konec - nachalo) <= n) {
                b = b + a.substring(nachalo, konec+1);
            }
        }
        System.out.println(b);
    }
}