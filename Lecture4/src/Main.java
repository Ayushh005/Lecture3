import java.util.Scanner;

public class Main {

    public static void merge(int[] arr,int si,int ei){
        if (arr.length <= 1){
            return;
        }
        int mid = (si + ei)/2;
        merge(arr,si,mid);
        merge(arr,mid+1,ei);

    }
    public static void mergeSort(int[] arr)

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 7, 9, 4, 1, 5 };
        merge(arr,0, arr.length-1);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
