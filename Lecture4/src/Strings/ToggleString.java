package Strings;

import java.util.Scanner;

public class ToggleString {
    public static void toggle(char[] ch){
        for (int i = 0; i < ch.length; i++){
            // Check if the character is uppercase
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                // Convert uppercase to lowercase by adding 32
                ch[i] = (char) (ch[i] + 32);
            }
            // Check if the character is lowercase
            else if (ch[i] >= 'a' && ch[i] <= 'z') {
                // Convert lowercase to uppercase by subtracting 32
                ch[i] = (char) (ch[i] - 32);
            }
            // Ignore non-alphabetic characters
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the string:");
        int n = s.nextInt();

        // Consume the newline character left in the buffer
        s.nextLine();

        System.out.println("Enter the string:");
        String st = s.nextLine();

        char[] ch = new char[n];
        for (int i = 0; i < n; i++){
            ch[i] = st.charAt(i);
        }

        toggle(ch);

        // Print the toggled string
        System.out.println("Toggled String: " + new String(ch));
    }
}
