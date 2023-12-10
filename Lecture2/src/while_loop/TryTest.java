package while_loop;
import java.util.Scanner;
public class TryTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a=");
        int a = s.nextInt();
        System.out.print("b=");
        int b = s.nextInt();

        int c = a+b;
        System.out.println("a+b="+c);
    }
}
