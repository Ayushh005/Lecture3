package TwoDimensionArray;

import java.util.Scanner;

public class LargestColumnSum {
    public static void largest(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int maxCol = Integer.MIN_VALUE;

        for (int i=0;i<cols;i++){
            int colSum = 0;
            for (int j=0;j<rows;j++){
                colSum += arr[i][j];
            }
            if (maxCol < colSum){
                maxCol = colSum;
            }
            System.out.println();
        }
        System.out.println(maxCol);
    }
    public static int[][] input(){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int arr[][] = new int[rows][cols];

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] input = input();
        largest(input);
    }
}
