package Functions;

public class PrimeTillN {
    public static boolean isPrime(int n) {
        int d= 2;
        while (d<n) {
            if (n%d==0) {
                return false;
            }
            d++;
        }
        return true;
    }
     public static void printPrime(int n) {
         for (int i=2;i<=n;i++) {
             boolean isPrime = isPrime(i);
             if (isPrime) {
                 System.out.println(i);
             }
         }
     }
    public static void main(String[] args) {
        printPrime(100);
    }
}
