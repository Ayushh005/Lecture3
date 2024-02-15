package while_loop;
import java.util.Scanner;
public class TryTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            int j = 1;
            while (j<=n){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
