

import java.util.Scanner;

public class Main {
    public static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 1;
            if (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbcddeeefggh";
        System.out.println(removeDuplicate(str));
    }
}

