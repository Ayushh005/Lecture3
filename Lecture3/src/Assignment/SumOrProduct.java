package Assignment;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        System.out.print("Enter an Integer = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Choose 1 for sum \t 2 for product");
        System.out.print("Enter your Choice = ");
        int c = s.nextInt();

        if (c==1) {
            int sum = 0;
            int num = 1;
            while (num<=n) {
                sum = sum + num;   //num
                num++;
            }
            System.out.println(sum);
        }
        else if (c==2) {
            int product = 1;
            int num = 1;
            while (num<=n) {
                product = product * num;
                num++;
            }
            System.out.println(product);
        }
        else {
            System.out.println("-1");
        }
    }
}
