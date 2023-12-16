package Patterns;
import java.util.Scanner;
public class ReverseSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=i) {
                System.out.print(i-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//    1
//    21
//    321
//    4321
