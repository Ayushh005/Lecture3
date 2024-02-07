package Array;


import java.util.Scanner;

public class PopulateArray {
    public static int[] input() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        return input;
    }

    public static void arrange(int[] input) {
        int size = input.length; // Use the length of the provided array
        int start = 0;
        int end = size - 1;
        int counter = 1;
        while (start <= end) {
            if (counter % 2 == 0) {
                input[start] = counter;
                counter += 1;
                start += 1;
            } else {
                input[end] = counter;
                counter += 1;
                end -= 1;
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " "); // Use the provided array, not input()
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = input();
        arrange(arr);
    }
}
