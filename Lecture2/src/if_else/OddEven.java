package if_else;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }
}
