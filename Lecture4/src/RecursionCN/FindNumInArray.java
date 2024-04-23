package RecursionCN;

public class FindNumInArray {
    public static boolean check(int arr[],int startIndex,int x){
        if (startIndex == arr.length) {
            return false;
        }
        if (arr [startIndex] == x){
            return true;
        }
        return check(arr,startIndex + 1,x);
    }
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,6,3,5,6};
        int x = 2;
        System.out.println(check(arr,0,x));
    }
}
