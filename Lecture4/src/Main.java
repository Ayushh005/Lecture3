public class Main {
    public static String replace(String str){
        if (str.length() <= 1) {
            return str;
        }
        String output;
        String ans = replace(str.substring(1));
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            output = "3.14" + ans.substring(1);
        }
        else {
            output = str.charAt(0) + ans;
        }
        return output;
    }
    public static void main(String[] args) {
        String str = "xpix";
        System.out.println(replace(str));
    }
}