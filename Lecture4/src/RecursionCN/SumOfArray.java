package RecursionCN;

public class SumOfArray {
    public static int sum(int[] arr,int startIndex){
        if (startIndex == arr.length){
            return 0;
        }
        return arr[startIndex] + sum(arr, startIndex+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,6,3,5,6};
        System.out.println(sum(arr,0));

    }
}
