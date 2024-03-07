package Array;

public class N_ConsecutiveNo {
    public static void con(int[] arr){
        int count = 0;
        int maxCount = 0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            count++;
        }
        maxCount = Math.max(maxCount, count);
        System.out.println(maxCount);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,6,3,5,5,5,2,2,2,2};
        con(arr);
    }
}
