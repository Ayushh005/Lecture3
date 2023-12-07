package while_loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Integer =");
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Here's the answer...");
    }
}
