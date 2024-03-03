package Recursion;

public class PowOfN {
    public static int pow(int a, int n){
        if (n == 1){
            return a;
        }
        int temp = pow(a,n/2);
        if (n%2 == 0){
            return temp * temp ;
        }
        else {
            return temp * temp * a ;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 17;
        System.out.println(pow(a,n));
    }
}
