package Recursion;

public class IsPalidrom {
    public static boolean isPalindrome(char[] a, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (a[s] == a[e]) {
            return isPalindrome(a, s + 1, e - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        char[] a = {'m', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm'};
        int s = 0;
        int e = a.length - 1;
        System.out.println(isPalindrome(a, s, e));
    }
}
