package Array;


import java.util.Scanner;

public class PopulateArray {
    public static int[] input(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        return input;
    }
    public static void populateArray(int[] input){
        int n = input.length;
        int start = 0;
        int end = n-1;
        int counter = 1;
        while (start<=end){
            if (counter%2==0){
                input[start] = counter;
                counter++;
                start++;
            }
            else {
                input[end] = counter;
                counter++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Array Size :");
        int arr[] = input();
        populateArray(arr);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
