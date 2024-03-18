package RecursionCN;

public class SubsetsOfArray {
    public static int[][] subsetHelper(int[] arr, int startIndex){
        // Base case: If the startIndex is equal to the length of the array,
        // return an array with an empty subset.
        if (startIndex == arr.length){
            int[][] output = new int[1][0];
            return output;
        }

        // Recursive call to generate subsets starting from the next index.
        int[][] smallerOutput = subsetHelper(arr, startIndex+1);

        // Initialize an array to hold the subsets, twice the size of the smallerOutput array.
        int[][] output = new int[2 * smallerOutput.length][];

        // Copy subsets from smallerOutput to output without the current element.
        int k = 0;
        for (int i = 0; i < smallerOutput.length; i++){
            output[k] = new int[smallerOutput[i].length];
            for (int j = 0; j < smallerOutput[i].length; j++){
                output[k][j] = smallerOutput[i][j];
            }
            k++;
        }

        // Add subsets with the current element.
        for (int i = 0; i < smallerOutput.length; i++){
            output[k] = new int[smallerOutput[i].length + 1];
            output[k][0] = arr[startIndex];
            for (int j = 1; j <= smallerOutput[i].length; j++){
                output[k][j] = smallerOutput[i][j-1];
            }
            k++;
        }
        return output;
    }

    // Wrapper method to call subsetHelper
    public static int[][] subsets(int arr[]){
        return subsetHelper(arr, 0);
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
}
