package Array;

public class TwoSum {
    public static void twosum(int[] arr,int target){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,3,2,7};
        int target = 9;

        twosum(arr,target);
    }
}
