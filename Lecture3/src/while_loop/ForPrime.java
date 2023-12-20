package while_loop;
import java.util.Scanner;
public class ForPrime {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean divided = false;

        for (int d=2;d<n;d++) {
            if (n%d==0) {
                divided = true;
                break;
            }
        }
        if (divided) {
            System.out.println(n+" is not prime");
        }
        else {
            System.out.println(n+" is prime");
        }
    }
}
