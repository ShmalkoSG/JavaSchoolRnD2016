import java.util.Scanner;

/**
 * Created by svetlanashmalko on 14.07.16.
 */
public class S2051 {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine();
        int i=a.length()/2;

        char[] chArray = a.toCharArray();
        for (int j = 0; j<a.length(); j++) {
            if (chArray[j]=='('){
                int open=1;
                int close=0;
                int k=j+1;
                while ((open-close)!=0) {
                    if (chArray[k]=='(') open=open+1;
                    else {
                        close=close+1;
                        if ((open-close)==0) System.out.println(j+1+" "+(k+1));
                    }
                    k=k+1;
                }


        }


    }

}}



