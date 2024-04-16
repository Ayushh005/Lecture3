

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static String removeChar(String str, char ch){
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i=0;i<n;i++){
            if (str.charAt(i) != 'a'){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "america";
        char ch = 'a';
        System.out.println(removeChar(str,ch));
    }
}

