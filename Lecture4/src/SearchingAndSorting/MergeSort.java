import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] input){
        if (input.length <= 1){
            return;
        }
        int mid = input.length/2;
        int[] a = new int[mid];
        int[] b = new int[input.length - mid];
        for (int i = 0;i < mid;i++){
            a[i] = input[i];
        }
        for (int i = mid;i < input.length;i++){
            b[i - mid] = input[i]; // Corrected index
        }
        mergeSort(a);
        mergeSort(b);
        merge(input,a,b);
    }
    public static void merge(int[] output,int[] a ,int[] b){
        int i=0,j=0,k=0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                output[k] = a[i];
                i++;k++;
            }
            else {
                output[k] = b[j];
                j++;k++;
            }
        }
        while (i < a.length){
            output[k] = a[i];
            i++;k++;
        }
        while (j < b.length) {
            output[k] = b[j];
            j++;k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 7, 9, 4, 1, 5 };
        mergeSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
