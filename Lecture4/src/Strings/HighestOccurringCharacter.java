package Strings;

public class HighestOccurringCharacter {
    public static char highestOccurance(String str){
        int n = str.length();
        int freq[] = new int[256];
        int maxFreq = 0;

        for (int i=0;i<n;i++){
            freq[str.charAt(i)]++;
            maxFreq = Math.max(maxFreq,freq[str.charAt(i)]);
        }
        char ans = '\0';

        for (int i=0;i<n;i++){
            if (freq[str.charAt(i)] == maxFreq){
                ans = str.charAt(i);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = " highestOccurringCharacter";
        System.out.printf("Highest Occurring Character : ");
        System.out.println(highestOccurance(str));
    }
}
