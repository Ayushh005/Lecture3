package Array;

public class DengerSorting {
    public static void sort(int[] arr,int n) {
        for (int i=0;i< arr.length;i++){
            int current = i;
            int next = i+1;
            if (current < next){
                System.out.print(next+" ");
            }
            else {
                System.out.println(-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2, 6, 7};
        int n = arr.length;
        sort(arr,n);
    }
}
