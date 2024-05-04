package RecursionCN;

public class FindAllOccuranceX {
    public static int[] find(int[]arr,int x,int startIndex){
        if (startIndex == arr.length) {
            return new int[0];
        }
        int smallOutput[] = find(arr,x,startIndex+1);
        if (arr[startIndex] == x) {
            int[] output = new int[smallOutput.length + 1];
            output[0] = startIndex;
            for (int i=0;i<smallOutput.length;i++){
                output[i+1] = smallOutput[i];
            }
            return output;
        }
        else {
            return smallOutput;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,8,9,8,5,6,4,3,8,4};
        int x = 8;
        int[] ans = find(arr,8,0);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
