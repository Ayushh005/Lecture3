package if_else;
import java.util.Scanner;
public class FtoC {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        int cel = (int)((5.0 / 9) * (f - 32));
        System.out.println(cel);
    }
}
