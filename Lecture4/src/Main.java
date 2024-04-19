import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static int count(String str){
        int i = 0;
        int count = 0;
        while (i<str.length() && str.length() != ' '){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "i am the best in this entire world";
        System.out.println(count(str));
    }
}