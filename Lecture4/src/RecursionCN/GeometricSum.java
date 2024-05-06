package RecursionCN;

public class GeometricSum {
    public static double sum(int k){
        if (k == 0) {
            return 1;
        }
        double ans = sum(k-1);
        return ans + 1/Math.pow(2,k);
    }
    public static void main(String[] args) {
        int k = 3;
        System.out.println(sum(k));
    }
}
