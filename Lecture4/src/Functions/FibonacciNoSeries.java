package Functions;

import java.util.Scanner;

public class FibonacciNoSeries {
    public static boolean cheakMember(int n) {
        int a = 0;
        int b = 1;
        int c;
        while (a<b) {
            c=a+b;
            a=b;
            b=c;
        }
        if (a==n){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean ans = cheakMember(n);
        System.out.println(ans);


    }
}
