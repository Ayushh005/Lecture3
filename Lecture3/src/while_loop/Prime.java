package while_loop;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer = ");
        int n = s.nextInt();

        int d = 2;
        while(d<=n-1) {
            if (n % d == 0) {
                System.out.println(n + " is not Prime.");
                return;
            }
            d = d + 1;
        }
            System.out.println(n+" is Prime.");

    }
}
