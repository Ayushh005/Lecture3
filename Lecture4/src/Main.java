

import java.util.Scanner;

public class Main {
    public static String removeDuplicate(String str){
        int n = str.length();
        if (n==0){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i=1;i<n;i++){
            if (str.charAt(i) != str.charAt(i-1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbcddeeefggh";
        System.out.println(removeDuplicate(str));
    }
}

