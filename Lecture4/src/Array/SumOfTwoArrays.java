package Array;

public class SumOfTwoArrays {
    public static void Sum(int[] arr1,int[] arr2,int[] output){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = Math.max(arr1.length,arr2.length);
        int carry = 0;
        while (i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum%10;
            carry = sum/10;

            i--;
            j--;
            k--;
        }
        while (i>=0){
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;

            i--;
            k--;
        }
        while (j>=0){
            int sum = arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;

            j--;
            k--;
        }
        output[0] = carry;

        for (int s=0;s< output.length;s++){
            System.out.print(output[s] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {4,6,4,8,3,9,5};
        int[] arr2 = {6,9,2,6,8,4};
        int[] output = new int[8];

        Sum(arr1,arr2,output);


    }
}
