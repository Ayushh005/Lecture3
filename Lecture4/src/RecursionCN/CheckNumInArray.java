package RecursionCN;

public class CheckNumInArray {
    public static int find(int arr[],int startIndex,int x){
        if (startIndex == arr.length){
            return -1;
        }
        if (arr[startIndex] == x){
            return startIndex;
        }
            return find(arr,startIndex + 1,x);

    }
    public static void main(String[] args) {
        int[] arr = {4,5,9,7,6,3,5,6};
        int x = 1;
        System.out.println(find(arr,0,x));
    }
}
