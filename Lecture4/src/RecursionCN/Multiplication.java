package RecursionCN;

import java.util.Scanner;

public class Multiplication {
    public static int multi(int m,int n){
        if (n == 1) {
            return m;
        }
        int ans = multi(m,n-1);

        return m + ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = 3;
        int n = 5;
        System.out.println(multi(m,n));
    }
}
