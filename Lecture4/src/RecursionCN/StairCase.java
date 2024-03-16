package RecursionCN;

public class StairCase {
    public static int stairWays(int n){
        if (n<0){
            return 0;
        }
        if (n == 0)
            return 1;
            return stairWays(n-1) + stairWays(n-2) + stairWays(n-3);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(stairWays(n));
    }
}
