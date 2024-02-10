package Array;

public class FindMaxMin {
    public static void maxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            max = Math.max(arr[i],max);
            min = Math.min(arr[i],min);
        }
        System.out.println(max+" "+min);
    }
    public static void main(String[] args) {
        int arr[] = {9,4,1,6,47,5,3,7};
        maxMin(arr);
    }
}
