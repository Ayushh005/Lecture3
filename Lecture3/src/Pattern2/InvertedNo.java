package Pattern2;

import java.util.Scanner;

public class InvertedNo {
    public static void main(String[] args) {
        System.out.print("Enter size of Pattern = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 1) {
                System.out.print(n - i + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//        4444
//        333
//        22
//        1

