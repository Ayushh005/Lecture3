package Array;

public class ArrayRotateCheak {
    public static int Cheak(int [] arr,int d){
        for(int i=0;i< arr.length;i++){
            if (arr[i]>arr[i+1])
                return (i+1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {4,6,4,8,3,9,5};
        int d = 3
        Cheak(arr,d);

    }
}
