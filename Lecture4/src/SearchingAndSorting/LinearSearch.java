package SearchingAndSorting;

public class LinearSearch {
    public static void search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print(i);
                return; // Exit the method once the element is found
            }
        }
        System.out.print(-1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 3, 9, 5};
        int x = 3;
        search(arr, x);
    }
}

