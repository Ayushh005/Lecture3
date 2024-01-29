package SearchingAndSorting;

public class BinarySearch {
    public static int BinarySearch(int[] arr,int x) {
        int s = 0;
        int e = arr.length-1;

        while (s<=e){
            int mid = (s+e)/2;

            if (arr[mid] > x){
                e = mid - 1;
            } else if (arr[mid]<x) {
                s = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,11,12,45};
        int x = 11;
        int ans = BinarySearch(arr,x);
        System.out.println("Index : "+ ans);

    }
}
