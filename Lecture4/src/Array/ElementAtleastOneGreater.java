package Array;

public class ElementAtleastOneGreater {
    public static void countGreater(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int count = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] == max){
                count++;
            }
        }
        int ans = arr.length - count;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,11,8,2,10,9,11};
        System.out.print("No. of  valid Elements having atleast One greater then itself = ");
        countGreater(arr);
    }
}
