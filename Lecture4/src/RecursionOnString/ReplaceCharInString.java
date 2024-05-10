package RecursionOnString;

public class ReplaceCharInString {
    public static String replace(String str,char c1,char c2){
        if (str.length() == 0) {
            return "";
        }
        String smallAns = replace(str.substring(1),c1,c2);

        char ans;
        if (str.charAt(0) == c1) {
            ans = c2;
        }
        else {
            ans = str.charAt(0);
        }
        return ans + smallAns;
    }
    public static void main(String[] args) {
        String str = "c videos.com";
        char c1 = 'c';
        char c2 = 'x';
        System.out.println(replace(str,c1,c2));
    }
}
