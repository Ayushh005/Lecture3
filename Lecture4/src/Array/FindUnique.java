package Array;

public class FindUnique {
    public static void Unique(int[] arr) {

        int res = arr[0];
        for (int i=1;i<arr.length;i++) {
            res=res^arr[i];

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int arr[] = {1,1,5,5,6,7,7};
        Unique(arr);
    }
}
