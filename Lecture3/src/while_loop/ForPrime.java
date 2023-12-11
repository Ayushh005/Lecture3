package while_loop;
import java.util.Scanner;
public class ForPrime {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int d=2;d<=n-1;d++) {
            if (n%d==0) {
                System.out.println(n+" is not Prime");
                return;
            }
                System.out.println(n+" is Prime");
                return;
        }
    }
}
