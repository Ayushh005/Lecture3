package Array;

public class ReverseArray {
    public static void rotate(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        for (int i=0;i<n;i++){
            while (start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        System.out.println("Original Array:");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        rotate(arr);
        System.out.println();
        System.out.println("Array in Reverse Order:");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
