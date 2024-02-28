package Strings;

public class VowelsInString {
    public static void count(String str){
        int count = 0;
        for (int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            //char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Count of vowels in String = " + count);
    }
    public static void main(String[] args) {
        String  str = "Ayush";
        count(str);
    }
}
