package Recursion;

public class RemoveDuplicate {
    public static void remove(String str, int i, StringBuilder newStr, boolean[] map) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(i);
        if (map[current - 'a']) {
            remove(str, i + 1, newStr, map);
        } else {
            map[current - 'a'] = true;
            remove(str, i + 1, newStr.append(current), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        remove(str, 0, new StringBuilder(), new boolean[26]);
    }
}
