package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrams {
    public static void anagram(String s1,String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()){
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();

            // sort the array
            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean result = Arrays.equals(str1,str2);
            if (result){                   //  you can also write true insted of result.
                System.out.println(s1 + " and " + s2 + " are anagram of each other.");
            }
            else {
                System.out.println(s1 + " and " + s2 + " are not anagram of each other.");
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "Race";
        String s2 = "Care";

        anagram(s1,s2);
    }
}
