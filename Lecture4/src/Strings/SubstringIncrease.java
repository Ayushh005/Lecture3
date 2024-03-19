package Strings;

public class SubstringIncrease {
    public static void printPrefix(String s){
        for (int i=0;i<s.length();i++){
            System.out.println(s.substring(0,i+1));
        }
    }
    public static void main(String[] args) {
        String s = "abcdef";
        printPrefix(s);
    }
}
