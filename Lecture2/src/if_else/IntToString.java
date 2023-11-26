package if_else;
import java.util.Scanner;
public class IntToString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1)
        {
            System.out.println("One");
        }
        else if (a==2)
        {
            System.out.println("Two");
        }
        else if (a==3)
        {
            System.out.println("Three");
        }
    }
}
