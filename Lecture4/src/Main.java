import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int compress(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "i am the best in this entire world";
        System.out.println(compress(str));
    }
}
