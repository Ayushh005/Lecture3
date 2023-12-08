package while_loop;
import java.util.Scanner;
public class ForPrime {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i=2;i<=n-1;i++) {
            if (n%i==0) {
                System.out.println(n+" is not Prime");
            }
            else {
                System.out.println(n+" is Prime");
            }
        }
    }
}
