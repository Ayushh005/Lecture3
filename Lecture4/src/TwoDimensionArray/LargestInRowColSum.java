package TwoDimensionArray;

import java.util.Scanner;

public class LargestInRowColSum {
    public static void largest(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<rows;i++){
            int rowSum = 0;
            for (int j=0;j<cols;j++){
                rowSum += arr[i][j];
            }
            max = Math.max(max,rowSum);
        }

        for (int i=0;i<cols;i++){
            int colSum = 0;
            for (int j=0;j<rows;j++){
                colSum += arr[i][j];
            }
            max = Math.max(max,colSum);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }
        }
        largest(arr);
    }
}
