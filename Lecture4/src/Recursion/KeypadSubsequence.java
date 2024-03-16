package Recursion;

public class KeypadSubsequence {
    public static String[] singleDigit(int n) {
        if (n <= 1 || n > 10) {
            return new String[0];
        }
        if (n == 2) {
            return new String[]{"a", "b", "c"};
        } else if (n == 3) {
            return new String[]{"d", "e", "f"};
        } else if (n == 4) {
            return new String[]{"g", "h", "i"};
        } else if (n == 5) {
            return new String[]{"j", "k", "l"};
        } else if (n == 6) {
            return new String[]{"m", "n", "o"};
        } else if (n == 7) {
            return new String[]{"p", "q", "r", "s"};
        } else if (n == 8) {
            return new String[]{"t", "u", "v"};
        } else {
            return new String[]{"w", "x", "y", "z"};
        }
    }

    public static String[] keypad(int n) {
        if (n == 0) {
            return new String[]{""};
        }
        String[] smallNumberArray = keypad(n / 10);
        String[] singleDigitOutput = singleDigit(n % 10);
        String[] output = new String[singleDigitOutput.length * smallNumberArray.length];
        int k = 0;
        for (int i = 0; i < singleDigitOutput.length; i++) {
            for (int j = 0; j < smallNumberArray.length; j++) {
                output[k] = smallNumberArray[j] + singleDigitOutput[i];
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int n = 23;
        String[] result = keypad(n);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
