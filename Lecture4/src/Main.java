

import java.util.Scanner;

public class Main {
    public static int profit(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for (int i=0;i< arr.length;i++){
            if (arr[i] < buy){
                buy = arr[i];
            }
            profit = arr[i] - buy;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {44,30,24,32,35,30,40,38,15};
        System.out.print("maximum profit : ");
        System.out.println(profit(arr));
    }
}

