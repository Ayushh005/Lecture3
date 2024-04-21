package RecursionCN;

import java.util.Scanner;

public class XPowN {
    public static int power(int x ,int n){
        if (n==0){
            return 1;
        }
        int ans = power(x,n/2);

        if (n%2 == 0){
            return ans*ans;
        }
        else {
            return ans*ans*x;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        int ans = power(x,n);
        System.out.println(ans);
    }
}
