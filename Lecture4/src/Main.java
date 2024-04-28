import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int sum(int arr[],int startIndex,int x){
        if (startIndex == arr.length) {
            return -1;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        }
        return sum(arr,startIndex+1,x);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,9,7,6,3,5,6};
        int x = 6;
        System.out.println(sum(arr,0,x));
    }
}