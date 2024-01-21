package Array;

import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int[] arr,int x) {
        for (int i=0;i<= arr.length;i++) {
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt(); // Read array elements
            }

            int x = scanner.nextInt(); // Value to search for

            int result = LinearSearch(arr,x);
            System.out.println(result); // Print the result
        }
    }
}
