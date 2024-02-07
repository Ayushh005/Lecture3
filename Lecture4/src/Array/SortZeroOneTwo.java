package Array;

public class SortZeroOneTwo {
    public static void sort(int[] arr){
        int n = arr.length;
        int i = 0;
        int zero = 0;
        int two = n-1;
            while (i<=two){
                if (arr[i]==0){
                    int temp = arr[zero];
                    arr[zero] = arr[i];
                    arr[i] = temp;
                    i++;
                    zero++;
                } else if (arr[i]==2) {
                    int temp = arr[i];
                    arr[i] = arr[two];
                    arr[two] = temp;
                    two--;
                }
                else {
                    i++;
                }
            }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,2,0,1};
        System.out.println("Given Array :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sort(arr);

        System.out.println("Sorted Array : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
