

import java.util.Scanner;

public class Main {
    public static void profit(int[] arr){
        int n = arr.length;
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for (int i=0;i<n;i++){
            if (buy > arr[i]){
                buy = arr[i];
            }
            profit = arr[i] - buy;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int[] arr = {44,30,24,32,35,30,40,38,15};

        profit(arr);
    }
}

