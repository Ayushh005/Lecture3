package SearchingAndSorting;

public class BinarySearch {
    public static void BinarySearch(int[] arr,int x){
        int s = 0;
        int e = arr.length-1;
        int mid = s;
        while (s<=e){

            mid = s + (e-s)/2;

            if (arr[mid]>x){
                e = mid-1;
            } else if (arr[mid]<x) {
                s = mid+1;
            }
            else {
                System.out.println(mid);
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,11,12,45};
        int x = 11;

        BinarySearch(arr,x);
    }
}
