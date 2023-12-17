package Pattern2;

import java.util.Scanner;

public class MirrorImgNo {
    public static void main(String[] args) {
        System.out.print("Enter size of Pattern = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            int space = 1;
            while (space<=n-i) {
                System.out.print(" ");
                space++;
            }
            while (j<=i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//        1
//       12
//      123
//     1234