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
    public static int largest(int input[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length ; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }
    public static void Print(int input[]) {
        int size = input.length;
        for (int i=0;i<size;i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter size of Array = ");
        int arr[] = input();

        Print(arr);
        int largest = largest(arr);
        System.out.print("Largest element = "+ largest);
    }
}
