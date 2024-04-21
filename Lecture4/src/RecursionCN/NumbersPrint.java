package RecursionCN;

import java.util.Scanner;

public class NumbersPrint {
    public static void print(int n){
        if (n==1){
            System.out.println(n+" ");
            return;
        }
        print(n-1);

        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        print(n);
    }
}
