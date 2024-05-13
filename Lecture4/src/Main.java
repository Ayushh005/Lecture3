import java.util.Scanner;

public class Main {
    public static String remove(String str){
        if (str.length() <= 1){
            return str;
        }
        if (str.charAt(0) == str.charAt(1)){
            return remove(str.substring(1));
        }
        String ans = remove(str.substring(1));
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "aaabbcddeee";
        System.out.println(remove(str));
    }
}
