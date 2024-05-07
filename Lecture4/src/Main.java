import java.util.Scanner;

public class Main {
    public static boolean check(String str, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e - 1)) {
            return false;
        }
        return check(str, s + 1, e - 1);
    }

    public static void main(String[] args) {
        String str = "racecar";
        int s = 0; // Start from index 0
        int e = str.length() - 1; // Index of the last character
        System.out.println(check(str, s, e) ? "Palindrome" : "Not a palindrome");
    }
}
