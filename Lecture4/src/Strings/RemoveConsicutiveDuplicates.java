package Strings;

public class RemoveConsicutiveDuplicates {
    public static String removeDuplicate(String str){
        int n = str.length();
        if (n == 0){
            return str;
        }
        String ans = "";
        int startIndex = 0;
        while (startIndex < n){
            char uniqueChar = str.charAt(startIndex);
            int nextUniqueCharIndex = startIndex + 1;

            while (nextUniqueCharIndex < n && str.charAt(nextUniqueCharIndex) == uniqueChar){
                nextUniqueCharIndex++;
            }
            ans += uniqueChar;
            startIndex = nextUniqueCharIndex;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabbbcddeeefggh";
        System.out.println(removeDuplicate(str));
    }
}
