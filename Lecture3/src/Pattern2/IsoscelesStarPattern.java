package Pattern2;

import java.util.Scanner;

public class IsoscelesStarPattern {
    public static void main(String[] args) {
        System.out.print("Enter size of pattern = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1 ;
        while (i<=n) {
            int space = 1 ;
            while (space<=n-i) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            int p = 1;
            while (j<=i) {
                System.out.print("*");
                p++;
                j++;
            }
            p=i-1;
            j=1;
            while (j<=i-1) {
                System.out.print("*");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
