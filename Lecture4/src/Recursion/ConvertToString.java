package Recursion;

public class ConvertToString {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printdigits(int num){
        if (num == 0){
            return;
        }
        int lastDigit = num % 10;
        printdigits(num/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int num = 2002;
        printdigits(num);
    }
}
