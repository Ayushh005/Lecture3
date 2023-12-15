package Patterns;
import java.util.Scanner;
public class PatternB {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//    1234
//    1234
//    1234
//    1234