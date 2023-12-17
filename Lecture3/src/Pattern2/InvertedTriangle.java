package Pattern2;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        System.out.print("Enter size of Pattern = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n-i+1) {
                System.out.print("*");
                j++;
            }
            int space = 1;
            while (space<=i) {
                System.out.print(" ");
                space++;
            }
            System.out.println();
            i++;
        }
    }
//        ****
//        ***
//        **
//        *



}
