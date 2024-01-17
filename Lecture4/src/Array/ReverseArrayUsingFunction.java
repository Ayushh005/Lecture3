package Array;

import java.util.Scanner;

public class ReverseArrayUsingFunction {
    public static int[] arr() {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] arr = new int[size];
        for (int i=0;i< arr.length;i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void print (int arr[]) {
        int size = arr.length;
        for (int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = arr();
        print(arr);
    }
}
