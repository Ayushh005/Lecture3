package Patterns;

import java.util.Scanner;

public class CharReverse {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int x = 'A' + n - i;
            int j = 1;
            while (j<=i) {
                System.out.print((char)x);
                j++;
                x++;
            }
            System.out.println();
            i++;
        }
    }
}
