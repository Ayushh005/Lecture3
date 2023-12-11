package while_loop;
import java.util.Scanner;
public class SumofEvenNo {
    public static void main(String[] args) {
        System.out.println("som of even no.");
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0;
        int i = 0;
        while (i<=n) {
            sum = sum + 1 ;
            i = i + 2 ;
        }
        System.out.println(sum);
    }
}
