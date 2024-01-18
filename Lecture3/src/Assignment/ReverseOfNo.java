package Assignment;

import java.util.Scanner;

public class ReverseOfNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int decimal = 0, pow = 1;
        while (num>0) {
            int last = num%10;
            decimal +=last * pow;
            pow *= 2;
            num = num/10;
        }
        System.out.println(decimal);
    }
}
