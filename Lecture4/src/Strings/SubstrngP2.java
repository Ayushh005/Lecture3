package Strings;

public class SubstrngP2 {
    public static void printAllSubstring(String str) {
        for (int len = 1; len <= str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                int j = i + len;
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        printAllSubstring(str);
    }
}
