package Array;

public class Incrementarray {
    public static void incrementArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            arr[i] += 1;
        }
    }

    public static void print(int arr[]){
        int size = arr.length;
        for (int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        incrementArray(arr);
        print(arr);

    }
}
