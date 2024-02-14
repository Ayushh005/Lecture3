package OperatorAndForLoop;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        for (int i=1;i<n;i++) {
            int c = a + b ;
            a = b;
            b = c;
            System.out.print(a+" ");
        }
    }
}
