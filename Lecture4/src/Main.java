import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int ans = fibonacci(n-1) + fibonacci(n-2);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter an Integer : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibonacci(n));
    }
}