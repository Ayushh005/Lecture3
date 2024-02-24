package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("Tony Stark");
        System.out.println(str2.length());  //  used for finding a length of string

        // string are immutable

        Scanner s = new Scanner(System.in);
        String name;
        name = s.nextLine();      //s.next();  for one word only while s.nextLine(); for one line.
        System.out.print(name);

        // concatenation
        String firstName = "Ayush";
        String lastName = "Sarraf";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);       // Ayush Sarraf

        // for traversing
        System.out.println(fullName.charAt(0));    // gives the value at index 0 - A

        for (int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
}
