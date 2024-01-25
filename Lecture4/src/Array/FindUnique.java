package Array;

import java.util.Scanner;

public class FindUnique {
//    public static int[] arr() {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int[] arr = new int[n];
//        for (int i=0;i<n;i++) {
//            arr[i] = s.nextInt();
//        }
//        return arr;
//    }
    public static void Unique(int[] arr) {
        int n = arr.length;
        for (int i=0;i<=n;i++) {
            int j;
            for (j=0;j<n;j++) {
                if (i != j) {
                    if (arr[i]==arr[j]) {
                        break;
                    }
                }
            }
            if (j==arr.length) {
                return arr[i];
            }
        }
      //  return Integer.MAX_VALUE;
    }
    public static void print(int input[]){
        int size = input.length;
        for (int i=0;i<size;i++) {
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,1,5,5,6,7,7,};
        print(arr);
    }
}
