package RecursionCN;

public class SumOfDigits {
    public static int sum(int n){
        if (n < 10){
            return n;
        }
        int ans = sum(n/10);
        int num = n%10;
        return num + ans;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
}
