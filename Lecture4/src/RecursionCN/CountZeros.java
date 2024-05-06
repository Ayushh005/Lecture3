package RecursionCN;

public class CountZeros {
    public static int count(int n){
        if (n<10){
            if (n == 10) {
                return 1;
            }else{
                return 0;
            }
        }
        int ans = count(n/10);
        int cnt = 0;
        if (n%10 == 0){
            cnt = cnt + 1;
        }
        return cnt + ans;
    }
    public static void main(String[] args) {
        int n = 10203;
        System.out.println(count(n));
    }
}
