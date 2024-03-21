package Strings;

public class ReverseSentenceStringBuilder {
    public static String reverse(String str){
        int end = str.length();
        int i = str.length()-1;
        StringBuilder ans = new StringBuilder();
        while (i>=0){
            if (str.charAt(i) == ' '){
                ans.append(str.substring(i+1,end)).append(" ");
                end = i;
            }
            i--;
        }
        ans.append(str.substring(i+1,end));
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "This is Ayush Sarraf";
        System.out.println(reverse(str));
    }
}
