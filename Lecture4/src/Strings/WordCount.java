package Strings;

public class WordCount {
    public static int print(String s){
        if (s.length() == 0){
            return 0;
        }
        int spaces = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                spaces++;
            }
        }
        return spaces+1;
    }
    public static void main(String[] args) {
        String s = "Coding Ninjas!";
        System.out.println(print(s));
    }
}
