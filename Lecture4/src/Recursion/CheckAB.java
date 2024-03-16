package Recursion;

public class CheckAB {
    public static boolean checkAB(String str){
        if (str.length()==0){
            return true;
        }
        if (str.charAt(0) == 'a'){
            if (str.substring(1).length() > 1 && str.substring(1,3).equals("bb")){
                return checkAB(str.substring(3));
            }
            else {
                return checkAB(str.substring(1));
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String S = "abababa";
        System.out.println(checkAB(S));
    }
}
