package RecursionCN;

public class BinarySearch {
    public static int binarySearch(int[] arr,int start,int end,int x){
        if (start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == x){
            return mid;
        }
        else if (arr[mid] < x){
            return binarySearch(arr, mid+1, end, x);
        }
        else {
            return binarySearch(arr, start, mid-1, x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,8};
        System.out.println(binarySearch(arr,0, arr.length-1, 6));
    }
}
