package Array;

public class InsertionSort {
    public static void InsertionSort (int[] arr){
        for (int i=1;i< arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1,7,6};
        InsertionSort(arr);
        System.out.print("Sorted Array : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
