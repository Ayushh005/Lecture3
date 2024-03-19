package Strings;

public class ReverseSentence {
    public static String reverse(String str){
        int end = str.length();
        int i = str.length()-1;
        String ans = "";
        while (i>=0){
            if (str.charAt(i) == ' '){
                ans = ans + str.substring(i+1,end)+" ";
                end = i;
            }
            i--;
        }
        ans += str.substring(i+1,end);
        return ans;
    }
    public static void main(String[] args) {
        String str = "I am Ayush Sarraf";
        System.out.println(reverse(str));
    }
}
