package Recursion;

public class Basics {
    public static void printDec(int n){             // for decreasing order
        if (n == 1){                                //  base case
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);                           //  call itself until they reach base case
    }

    public static void printInc(int n){
        if (n == 1) {                                // for increasing order
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
    }
}
