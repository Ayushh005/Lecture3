import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

    private static int[] search(int[] arr,int x,int startIndex){
        if (startIndex == arr.length) {
            return new int[0];
        }
        int smallAns[] = search(arr,x,startIndex+1);

        if (arr[startIndex] == x) {
            int[] ans = new int[smallAns.length + 1];
            ans[0] = startIndex;
            for (int i=0;i< smallAns.length;i++){
                ans[i+1] = smallAns[i];
            }
            return ans;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,9,8,5,6,4,3,8};
        int x = 12;
        int[] ans = search(arr,8,0);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}