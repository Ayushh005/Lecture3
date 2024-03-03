package Recursion;

public class N_FibonocciNo {
    public static int fibonocci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int temp1 = fibonocci(n-1);
        int temp2 = fibonocci(n-2);

        return temp1 + temp2;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonocci(n));
    }
}
