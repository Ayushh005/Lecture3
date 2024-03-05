package Recursion;

public class RemoveDuplicate {
    public static void remove(String str,int i,StringBuilder newStr,boolean[] map){
        if (i == str.length()){
            System.out.println(newStr);
            return;
        }
        char current = newStr.charAt(i);
        if (map[current-'a'] == true){
            remove(str,i+1,newStr,map);
        }
        else {
            map[current-'a'] == true;
            remove(str,i+1,newStr.append(current),map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        System.out.println(str,0,StringBuilder(""),new boolean[26]);
    }
}
