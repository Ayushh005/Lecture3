import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static String compress(String str){
        int n = str.length();
        if (n == 0)  return str;

        StringBuilder ans = new StringBuilder();

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(ch);
            if (count > 1) {
                ans.append(count);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbcddeeefggh";
        System.out.println(compress(str));
    }
}
