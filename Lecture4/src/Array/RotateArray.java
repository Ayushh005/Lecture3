package Array;

public class RotateArray {
    public static void Rotate(int[] arr,int d){
        int n = arr.length;
        int[] temp = new int[n];
        int current = 0;
        for (int i=d;i< n;i++){
            temp[current] = arr[i];
            current++;
        }
        for (int i=0;i<d;i++){
            temp[current] = arr[i];
            current++;
        }
        for (int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;

        Rotate(arr,d);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
