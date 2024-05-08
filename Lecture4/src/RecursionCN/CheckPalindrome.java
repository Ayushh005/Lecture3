package RecursionCN;

public class CheckPalindrome {
    public static boolean isPalindrome(String str){
        if (str.length() == 1){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "rayushr";
        int s = str.charAt(0);
        int e = str.length();
        System.out.println(isPalindrome(str));;
    }
}
