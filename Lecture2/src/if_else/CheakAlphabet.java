package if_else;
import java.util.Scanner;
public class CheakAlphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.nextLine().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.out.println(1);
        }
         else if (ch>='a' && ch>='b') {
            System.out.println(0);
        }
         else {
            System.out.println(-1);
        }

    }
}
