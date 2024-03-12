package Recursion;

public class FIndAllOccurance {
    public static void findOccurance(int[] arr,int key,int i){
        if (i== arr.length){
            return;
        }
        if (arr[i] == key){
            System.out.print(i+" ");;
        }
        findOccurance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        findOccurance(arr,key,0);
    }
}
