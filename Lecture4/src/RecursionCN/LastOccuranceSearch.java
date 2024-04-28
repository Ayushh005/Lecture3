package RecursionCN;

public class LastOccuranceSearch {
    public static int lastSearch(int[] arr,int x){
        return lastSearch(arr,x,0);
    }

    public static int lastSearch(int[] arr,int x,int startIndex){
        if (startIndex == arr.length) {
            return -1;
        }
        int ans = lastSearch(arr, x, startIndex+1);
        if (ans != -1) {
            return ans;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,9,8,5,6,4,3,8};
        int x = 8;
        System.out.println(lastSearch(arr,x));
    }
}
