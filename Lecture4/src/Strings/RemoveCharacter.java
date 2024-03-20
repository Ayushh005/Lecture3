package Strings;

public class RemoveCharacter {
    public static String removeChar(String str,char ch){
        int n = str.length();
        String output = "";

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != 'a'){
                output += str.charAt(i);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String str = "america";
        char ch = 'a';
        System.out.println(removeChar(str,ch));
    }
}
