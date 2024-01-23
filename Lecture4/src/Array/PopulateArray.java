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
        int left = 0;
        int right = size - 1;
        int counter = 1;
        while (left <= right) {
            if (counter % 2 == 0) {
                input[left] = counter;
                counter += 1;
                left += 1;
            } else {
                input[right] = counter;
                counter += 1;
                right -= 1;
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
