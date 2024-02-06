package Array;

public class RotateArray {
    public static void Rotate(int[] arr,int e){
        int n = arr.length;
        int[] temp = new int[n];
        int current = 0;
        for (int i=e;i< n;i++){
            temp[current] = arr[i];
            current++;
        }
        for (int i=0;i<e;i++){
            temp[current] = arr[i];
            current++;
        }
        for (int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 7;
        int e = d % arr.length;
        System.out.print("Given Array : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("No. of Left Rotation : "+d);

        Rotate(arr,e);
        System.out.println();
        System.out.print("Sorted Array : ");

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
