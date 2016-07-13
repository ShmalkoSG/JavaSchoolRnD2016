/**
 * Created by svetlanashmalko on 13.07.16.
 */
import java.util.Scanner;
public class S2006 {
    public static void main(String[] args){
        System.out.println("Введите число в сантиметрах");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fut;
        int dyuim=(int)Math.round((double)n /3);
        fut=(int)Math.round((double)n /36);
        System.out.println("Дюймов: "+ dyuim+ " Футов: "+fut);

    }
}