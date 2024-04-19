import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void reverse(int[] arr,int s, int e){
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int s = 0;
        int e = arr.length-1;
        int k = 3;

        reverse(arr,s,e);
        reverse(arr,s,k-1);
        reverse(arr,k,e);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}