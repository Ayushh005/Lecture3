package TwoDimensionArray;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();

        int[][] arr = new int[r][c];

        // this loop is for input
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = s.nextInt();
            }
        }

        // this loop is for output
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
