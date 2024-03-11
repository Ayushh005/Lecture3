package Recursion;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n==1)  return "1";

        String say = countAndSay(n-1);

        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<say.length();i++){
            count++;
            if(i==say.length()-1 || say.charAt(i)!=say.charAt(i+1)){
                ans.append(count).append(say.charAt(i));
                count=0;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }
}
