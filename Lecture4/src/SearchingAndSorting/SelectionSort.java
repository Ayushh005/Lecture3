package SearchingAndSorting;

public class SelectionSort {
    public static void Sort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int min = arr[i];
            int minIndex = i;
            for (int j=i;j< arr.length;j++){
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2,6,7};

        Sort(arr);
        System.out.print("Sorted Array :");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
