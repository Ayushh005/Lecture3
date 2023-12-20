package while_loop;

import java.util.Scanner;

public class WhilePrime {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int d = 2;
        boolean divided = false;
        while (d<n) {
            if (n % d == 0) {
                divided = true;
                break;
            }
            d = d + 1;
        }
            if (divided) {
                System.out.println("not prime");
            }
            else {
                System.out.println("prime");
            }
        }
    }

