package TwoDimensionArray;

import java.util.Scanner;

public class RowsWiseSum {
    public static void rowWiseSum(int[][] arr){
        int rows = arr.length;
        if (rows == 0){
            return;
        }
        int cols = arr[0].length;
        for (int i=0;i<rows;i++){
            int rowSum = 0;
            for (int j=0;j<cols;j++){
                rowSum += arr[i][j];
            }
            System.out.println(rowSum + " ");
        }
    }
    public static void print(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] input(){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] input = input();
        print(input);
        rowWiseSum(input);
    }
}
