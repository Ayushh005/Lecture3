package Recursion;

public class FriendsPairingProblem {
    public static int findWays(int n){
        if (n==1 || n==2){
            return n;
        }
        int single = findWays(n-1);

        int pair = findWays(n-2);
        int pairWays = (n-1) * pair;

        int totalWays = single + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findWays(n));
    }
}
