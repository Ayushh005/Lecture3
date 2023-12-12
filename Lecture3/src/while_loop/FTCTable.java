package while_loop;
import java.util.Scanner;
public class FTCTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Fahrenheit Value = ");
        int Start = sc.nextInt();
        System.out.print("Enter End Fahrenheit Value = ");
        int End = sc.nextInt();
        System.out.print("Enter Step Size between them = ");
        int Step = sc.nextInt();

        System.out.println("F" + "\t" + "C");
        int FTC = Start;
        while (FTC <= End) {
            int cel = (int)((5.0/9) * (FTC - 32));
            System.out.println(FTC + "\t" + cel);
            FTC += Step;
        }


    }
}
