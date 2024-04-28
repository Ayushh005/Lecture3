package RecursionCN;

public class FirstOccuranceSearch {
    public static int search(int[] arr,int x){
        return search(arr,x,0);
    }
    private static int search(int[] arr,int x,int startIndex){
        if (startIndex == arr.length) {
            return -1;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        }
        return search(arr,x,startIndex + 1);
    }
    public static void main(String[] args) {
        int[] arr = {10,8,9,8,5,6,4,3};
        int x = 8;
        System.out.println(search(arr,x,0));
    }
}
