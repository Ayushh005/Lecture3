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
        int words = spaces + 1;
        return words;
    }
    public static void main(String[] args) {
        String s = "Coding Ninjas!";
        System.out.print("Word Count : ");
        System.out.println(print(s));
    }
}
