package TwoDimensionArray;

import java.util.Scanner;

public class SpiralPrint {
    public static void spiral(int[][] arr){
        int rows = arr.length;
        if (rows == 0){
            return;
        }
        int cols = arr[0].length;
        int i,rs = 0,cs = 0;
        int numElements = rows * cols,count = 0;
        while (count < numElements){
            for (i = cs;count < numElements && i < cols;++i){
                System.out.print(arr[rs][i]+" ");
                count++;
            }
            rs++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
    }
}
