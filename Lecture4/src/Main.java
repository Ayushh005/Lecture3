

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int[] ans(int[] arr) {
        int n = arr.length;
        int start = 0;
        int last = n-1;
        int counter = 1;
        while (start <= last) {
            if (counter % 2 == 0) {
                arr[start] = counter;
                start++;
                counter++;
            }
            else {
                arr[last] = counter;
                last--;
                counter++;
            }
        }
        System.out.println("Array elements:");
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        ans(arr);

    }
}

