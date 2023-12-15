package Patterns;
import java.util.Scanner;
public class PatternA {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
//    1111
//    2222
//    3333
//    4444