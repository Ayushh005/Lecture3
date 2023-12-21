package Assignment;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1 , current = 1;

        while (count<=n) {
            int num = 3 * current + 2;
            if (num%4 != 0) {
                System.out.println(num + " ");
                count++;
            }
            current++;
        }
    }
}
