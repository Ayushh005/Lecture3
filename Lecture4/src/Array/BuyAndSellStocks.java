package Array;

public class BuyAndSellStocks {
    public static void profit(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 0;i< arr.length;i++) {
            if (buy > arr[i]) {
                buy = arr[i];
            }

                profit = arr[i]-buy;

            if (profit>maxProfit){
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
