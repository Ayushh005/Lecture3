package Recursion;

public class LengthOfString {
    public static void len(String str,int i){
        if (i==str.length()){
            return;
        }
        int count = 0;                                    //
        for (i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);                         //     len(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "ayushsarraf";
        len(str,0);
    }
}
