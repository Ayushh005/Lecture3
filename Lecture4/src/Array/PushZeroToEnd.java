package Array;

public class PushZeroToEnd {
    public static void Sort(int[] arr){
        int n = arr.length;
        int nonzero = 0;
        for (int i=0;i< n;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[nonzero];
                arr[nonzero] = temp;
                nonzero++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,3,0,2,0};
        Sort(arr);

    }
}
