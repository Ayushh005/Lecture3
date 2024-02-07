package Array;

import java.util.Scanner;

public class ReverseArrayUsingFunction {

    public static void rotate(int[] arr){
        int n = arr.length;
        int start = 1;
        int last = n-1;
        for (int i=0;i< n;i++){
            while (start < last){
                int temp = arr[start];
                arr[start] = arr[last];
                arr[last] = temp;
            }
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
