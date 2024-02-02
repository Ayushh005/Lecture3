package Array;

import java.util.Scanner;

class  SortZeroOne{
    public static void SortArray(int[] input){
        int zero = 0;
        for (int i=0;i< input.length-1;i++){
            if (input[i]==0){
                int temp = input[zero];
                input[zero] = input[i];
                input[i] = temp;
                zero++;
            }
        }
        for (int i=0;i< input.length;i++) {
            System.out.print(input[i]+" ");
        }
    }
    public static void main(String[] args) {
        int input[] = {0,0,1,0,1,1,0,1};
        SortArray(input);
    }
}
