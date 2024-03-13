package Recursion;

public class PowOfN {
    public static double pow(double a, int n){
        if (n == 0){
            return 1;
        }
        double temp = pow(a,n/2);
        if (n < 0){
            n = -n;
            a = 1/a;
        }
        if (n%2 == 0){
            return temp * temp ;
        }
        else {
            return temp * temp * a ;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int n = -2;
        System.out.println(pow(a,n));
    }
}
