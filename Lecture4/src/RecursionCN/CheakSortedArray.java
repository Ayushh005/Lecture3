package RecursionCN;

public class CheakSortedArray {
    public static boolean isSorted(int[] arr){
        return isSorted(arr,0);
    }
    private static boolean isSorted(int[] arr,int startIndex){
        if (startIndex >= arr.length-1) {
            return true;
        }
        if (arr[startIndex] > arr[startIndex + 1]){
             return false;
        }
        boolean smallAns = isSorted(arr,startIndex + 1);
        return smallAns;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,7,9};
        System.out.println(isSorted(arr));
    }
}
