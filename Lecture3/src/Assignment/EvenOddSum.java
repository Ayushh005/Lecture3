package Assignment;
import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        System.out.print("Enter Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int evensum = 0 , oddsum = 0;
        while (n>0) {
            int last = n % 10;
            if (last % 2==0) {
                evensum += last;
            }
            else {
                oddsum += last;
            }
            n = n/10;
        }
        System.out.println(evensum + " " + oddsum);
    }
}
