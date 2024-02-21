package Array;

public class FindNextGreaterElement {
    public static void printNGE(int[] arr,int n){
        for (int i=0;i<n;i++){
            int next = -1;
            for (int j=i+1;i<n-1;i++){
                if (arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
}
