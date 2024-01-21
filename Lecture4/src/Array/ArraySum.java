package Array;

import java.util.Scanner;

public class ArraySum {
    public static int[] input() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i=0;i<size;i++) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void printSum(int input[]) {
        int sum = 0;
        for (int i=0;i< input.length;i++) {
            sum=sum+input[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        int array[] = input();
        printSum(array);

    }
}
