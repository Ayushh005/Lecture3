package Array;

import java.util.Scanner;

public class Table {
    public static void print(int arr[]) {
        for (int i=0;i<arr.length;i++){
            int j = 1;
            while (j<=10){
                System.out.println(arr[i]+"x"+j+"="+arr[i]*j);
                j++;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int arr[] = {6,7,8,9,10};
        print(arr);

    }
}