package Recursion;

public class FirstOccurence {
    public static int fisOcr(int[] arr,int i,int key){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return fisOcr(arr,i+1,key);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,10,2,5,3};
        int key = 1;
        System.out.println(fisOcr(arr,1,key));
    }
}
