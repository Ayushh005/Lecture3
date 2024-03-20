package Strings;

public class CheckPermutation {
    public static boolean isPermutation(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
        int freq[] = new int[256];

        for (int i=0;i<256;i++){
            freq[i] = 0;
        }
        for (int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            freq[ch]++;
        }
        for (int i=0;i<a.length();i++){
            char ch = b.charAt(i);
            freq[ch]--;
        }

        for (int i=0;i<256;i++){
            if (freq[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        System.out.println(isPermutation(a,b));
    }
}
