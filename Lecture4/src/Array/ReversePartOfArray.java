package Array;


public class ReversePartOfArray {
    public static void reverse(int[] arr, int s, int e) {
        int start = s;
        int end = e;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2, 6, 7};
        int s = 3; // Starting index, not the value at index 3
        int e = arr.length - 1;

        System.out.print("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverse(arr, s, e);

        System.out.print("\nReversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
