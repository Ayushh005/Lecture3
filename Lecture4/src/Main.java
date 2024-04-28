import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int sum(int arr[],int startIndex){
        if (startIndex == arr.length) {
            return 0;
        }
        int ans = sum(arr,startIndex+1);
        return arr[startIndex] + ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,9,7,6,3,5,6};
        System.out.println(sum(arr,0));
    }
}