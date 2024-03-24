package TwoDimensionArray;

import java.util.Scanner;

public class DiagonalAndBoundarySum{
    private static int diagonalRSum(int[][] arr,int dimension) {
        int row = 0;
        int col = 0;
        int sumR = 0;

        while (row < dimension && col < dimension){
            sumR += arr[row][col];
            row++;
            col++;
        }
        return sumR;
    }
    private static int diagonalLSum(int[][] arr, int dimension){
        int row = 0;
        int col = arr.length-1;
        int sumL = 0;

        while (row < dimension && col >= dimension){
            sumL += arr[row][col];
            row++;
            col--;
        }
        return sumL;
    }
    private static int boundarySum(int[][] arr,int dimension){
        int sum = 0;
        for (int i=0;i<(dimension-1);i++){
            sum += arr[0][i];
            sum += arr[dimension-1][i];
            sum += arr[i][0];
            sum += arr[i][dimension-1];
        }
        return sum;
    }

    public static void totalSum(int[][] arr){
        int n = arr.length;
        if (n == 0){
            System.out.println(0);
            return;
        }
        int totalSum = diagonalLSum(arr,n) + diagonalRSum(arr,n) + boundarySum(arr,n);
        if (n%2 != 0){
            totalSum -= arr[n/2][n/2];
        }
        System.out.println(totalSum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of Matrix MxM : ");
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter elements of Matrix : ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        System.out.print("Sum of Diagonal and Boundary : ");
        totalSum(arr);
    }
}
