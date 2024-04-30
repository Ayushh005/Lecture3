import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int search(int[] arr,int x){
        return search(arr,x,0);
    }
    private static int search(int[] arr,int x,int startIndex){
        if (startIndex == arr.length) {
            return -1;
        }
        int ans = search(arr,x,startIndex + 1);
        if (ans != -1) {
            return ans;
        }
        if (arr[startIndex] == x) {
            return startIndex;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,9,8,5,6,4,3,8};
        int x = 12;
        System.out.println(search(arr,x,0));
    }
}