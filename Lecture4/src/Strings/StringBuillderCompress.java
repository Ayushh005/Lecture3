package Strings;

public class StringBuillderCompress {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "jhhhaaahhg";
        System.out.println(compress(str));
    }
}





//    StringBuilder output = new StringBuilder();
//    int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//        if (str.charAt(i) == str.charAt(i-1)) {
//        count++;
//        } else {
//        output.append(str.charAt(i - 1));
//        if (count > 1) {
//        output.append(count);
//        }
//        count = 1;
//        }
//        }
//        output.append(str.charAt(str.length() - 1));
//        if (count > 1) {
//        output.append(count);
//        }
//
//        return output.toString();
//        }
