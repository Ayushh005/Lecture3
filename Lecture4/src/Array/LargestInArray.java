package Array;

import java.util.Scanner;

public class LargestInArray {
    public static int [] input() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i=0;i<size;i++) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void Print(int input[]) {
        int size = input.length;
        for (int i=0;i<size;i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = input();
        Print(arr);
    }
}
