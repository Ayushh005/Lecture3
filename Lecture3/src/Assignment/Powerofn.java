package Assignment;
import java.util.Scanner;
public class Powerofn {
    public static void main(String[] args) {
        System.out.print("Enter an Integer and their power after space = ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        int ans = 1;
        while (n>0) {
            ans *= x;
            n--;
        }
        System.out.println(ans);
    }
}
