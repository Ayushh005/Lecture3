package TwoDimensionArray;

import java.util.Scanner;

public class WaveFormMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];

        // Input Reading
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Printing
        for (int i =0;i<m;i++) {
            if (i%2 == 0) {
                for (int j=0;j<n;j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j=n-1;j>=0;j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
