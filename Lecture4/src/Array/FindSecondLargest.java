package Array;

public class FindSecondLargest {
    public static int FindSecondLargest(int arr[]){
        if (arr.length==0){
            return Integer.MIN_VALUE;
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for( int i=1;i<arr.length;i++){
            if (largest<arr[i]){
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest<arr[i] && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,4,8,3,9,5};
        System.out.print("Given Array : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Second largest : ");
        int ans = FindSecondLargest(arr);
        System.out.println(ans);
    }
}
