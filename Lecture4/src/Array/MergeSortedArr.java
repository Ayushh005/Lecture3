package Array;

public class MergeSortedArr {
    public static void Sort(int[] arr1, int[] arr2){
        int[] c = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while (i< arr1.length && j< arr2.length){
            if (arr1[i] < arr2[j]){
                c[k] = arr1[i];
                i++;
                k++;
            }
            else {
                c[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i< arr1.length){
            c[k] = arr1[i];
            i++;
            k++;
        }
        while (j< arr2.length){
            c[k] = arr2[j];
            j++;
            k++;
        }
        System.out.print("Sorted Merge Array : ");
        for (int m=0;m< c.length;m++){
            System.out.print(c[m]+" ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,4,7,11};
        int arr2[] = {2,4,6,13};

        Sort(arr1,arr2);
    }
}
