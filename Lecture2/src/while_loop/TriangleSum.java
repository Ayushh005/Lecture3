package while_loop;

import java.util.Scanner;

public class TriangleSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=n){
            int j = 1;
            while (j<=i){
                System.out.print(sum);
                sum++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
