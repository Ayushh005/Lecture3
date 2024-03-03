package Recursion;

public class PowerOfN {
    public static int power(int a,int n){
        if (n == 1){                               //  also use n == 0 and return 1 not affect the ans
            return a;
        }
        int temp = power(a,n-1);

        return a * temp;
    }
    public static void main(String[] args) {
        int a = 4;
        int n = 5;
        System.out.println(power(a,n));
    }
}
