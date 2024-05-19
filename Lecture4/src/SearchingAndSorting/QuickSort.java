package SearchingAndSorting;

public class QuickSort {
    public static int partition(int[] arr,int si,int ei){
        int pivot = arr[si];
        int count = 0;
        for (int i=si;i<=ei;i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = count + si ;
        arr[si] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i=si,j=ei;
        while (i < j) {
            while (i <= ei && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
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
        quickSort(arr,partitionIndex,ei);

    }
    public static void quickSort(int[] arr){
        quickSort(arr,0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,8,6,3,2,1};
        quickSort(arr);
    }
}
