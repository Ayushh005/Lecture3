import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i =2;i<=n;i++) {
            boolean Isprime = true;
            for (int j =2;j<i;j++) {
                if (i%j==0) {
                    Isprime = false;
                    break;
                }
            }
            if (Isprime) {
                System.out.println(i);
            }
        }

    }
}
