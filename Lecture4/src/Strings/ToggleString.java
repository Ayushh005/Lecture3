package Strings;

import java.util.Scanner;

public class ToggleString {
    public static void toggle(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the string: ");
        int n = s.nextInt();

        // Consume the newline character left in the buffer
        s.nextLine();

        System.out.print("Enter the string: ");
        String st = s.nextLine();

        char[] ch = new char[n];
        for (int i = 0; i < n; i++){
            ch[i] = st.charAt(i);
        }

        toggle(ch);

        System.out.println("Toggled String: " + new String(ch));
    }
}
