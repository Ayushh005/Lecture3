package Array;

import java.util.Scanner;

public class LinearSearch {

    public static int LinearSearch(int[] input,int val) {
        for (int i=0;i<= input.length;i++) {
            if (input[i]==val) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Array : ");
        int t = s.nextInt();
            for (int j = 0;j<= t; t++) {
                System.out.println("Enter size of an Array : ");
                int size = s.nextInt();
                System.out.println("Enter Element of Array : ");
                int input[] = new int[size];
                for (int i = 0; i < size; i++) {
                input[i] = s.nextInt();
            }
            System.out.println("Enter the value you Search : ");
            int val = s.nextInt();
        }
         int result = LinearSearch(int input,val);
        System.out.println(result);
    }
}
