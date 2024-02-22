package TwoDimensionArray;

import java.util.Scanner;

public class PrintMN_NM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of Matrix = ");
        int m = s.nextInt();
        int n = s.nextInt();

        System.out.println("Enter Elements : ");
        int[][] arr = new int[m][n];

        for (int i=0;i<m;i++){

            for (int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("Your Output is : ");

        for (int j=0;j<n;j++){
            for (int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
