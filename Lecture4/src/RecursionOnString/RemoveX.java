package RecursionOnString;

public class RemoveX {
    public static String remove(String str){
        if (str.length() == 0) {
            return str;
        }
        String word = "";
        if (str.charAt(0) != 'x'){
            word = word + str.charAt(0);
        }
        String ans = remove(str.substring(1));
        return word + ans;

    }
    public static void main(String[] args) {
        String str = "axxbxcx";
        System.out.println(remove(str));
    }
}
