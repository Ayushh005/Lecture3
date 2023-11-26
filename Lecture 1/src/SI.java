import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal Amount=");
        int p= sc.nextInt();
        System.out.print("Rate=");
        int r= sc.nextInt();
        System.out.print("Time=");
        int t= sc.nextInt();
        int SI=(p*r*t)/100;
        int Total= p+SI;
        System.out.println("Total Amount="+Total);
        System.out.println("Interest="+SI);
    }
}
