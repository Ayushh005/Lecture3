package SearchingAndSorting;

public class QuickSort {
    public static int partition(int[] arr,int si,int ei) {
        int pivot = arr[si];
        int count = 0;
        for (int i=si+1;i<arr.length;i++){
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = si + count;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[si];
        arr[si] = temp;

        int i=si,j=ei;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return pivotIndex;
    }
    public static void quickSort(int[] arr,int si,int ei){
        if (si >= ei) {
            return;
        }
        int partitionIndex = partition(arr,si,ei);
        quickSort(arr,si,partitionIndex-1);
        quickSort(arr,partitionIndex+1,ei);
    }
    public static void quickSort(int[] arr){
        quickSort(arr,0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {4,9,7,8,6,3,2,1};
        quickSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
