package TwoDimensionArray;

import java.util.Scanner;

public class DiagonalSum {
    public static int diagonalSum(int[][] arr){
        int n = arr.length;
        int sumL = 0;
        int sumR = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i == j){
                    sumL += arr[i][j];
                }
                if (i+j== n-1){
                    sumR += arr[i][j];
                }
            }
        }
        int sum = sumR + sumL;
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Matrix :");
        System.out.println();
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter elements of Matrix :");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int ans = diagonalSum(arr);
        System.out.println("Sum of Diagonals : " + ans);
    }
}
