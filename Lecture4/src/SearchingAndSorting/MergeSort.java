package SearchingAndSorting;

public class MergeSort {
    public static void mergeSort(int[] arr){
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length/2;
        int[] part1 = new int[mid];
        int[] part2 = new int[arr.length - mid];
        for (int i=0;i < mid;i++){
            part1[i] = arr[i];
        }
        int k = 0;
        for (int i= mid;i< arr.length;i++){
            part2[i - mid] = arr[i];
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(part1,part2,arr);
    }
    public static void merge(int[] part1,int[] part2,int[] output){
        int i=0,j=0,k=0;
        while (i < part1.length && j < part2.length){
            if (part1[i] < part2[j]){
                output[k] = part1[i];
                i++;
            }
            else {
                output[k] = part2[j];
                j++;
            }
            k++;
        }
        while (i < part1.length) {
            output[k] = part1[i];
            i++;
            k++;
        }
        while (j < part2.length) {
            output[k] = part2[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,4,7,8,9,3,6,5};
        mergeSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
