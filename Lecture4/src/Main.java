import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        int ans = fibonacci(n/10);
        return ans+1;
    }

    public static void main(String[] args) {
        System.out.println("Enter an Integer : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacci(n));
    }
}