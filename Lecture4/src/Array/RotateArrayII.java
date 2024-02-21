package Array;

public class RotateArrayII {
    public static void reverse(int[] arr,int s,int e){
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
        int[] arr = {1,2,3,4,5,6,7,8};
        int s = 0;
        int e = arr.length-1;
        int k = 3;

        reverse(arr,s,e);
        reverse(arr,s,k-1);
        reverse(arr,k,e);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
