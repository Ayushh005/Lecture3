package Patterns;

import java.util.Scanner;

public class CharTri1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                System.out.print((char)('A' + i - 1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//    A
//    BB
//    CCC
//    DDDD