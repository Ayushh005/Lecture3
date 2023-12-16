package Pattern2;
import java.util.Scanner;
public class StarPatternRightAllign {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n-i) {
                System.out.print(" ");
                j++;
            }
            while (j<=n) {
                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
//       *
//      **
//     ***
//    ****
