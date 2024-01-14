package Functions;

import java.util.Scanner;

public class Sum {
    public static int findSum (int a,int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int c = findSum(a,b);
        System.out.println(c);
    }
}
