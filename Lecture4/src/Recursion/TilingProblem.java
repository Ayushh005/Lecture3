package Recursion;

public class TilingProblem {
    public static int tilingProb(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int verticalTile = tilingProb(n-1);
        int horizontalTile = tilingProb(n-2);

        int totalWays = verticalTile + horizontalTile;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProb(n));
    }
}
