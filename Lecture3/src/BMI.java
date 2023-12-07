import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Name=");
        char name = s.next().charAt(0);
        System.out.print("Height=");
        double h = s.nextDouble();
        double ht = h/100;
        System.out.print("Weight=");
        double w = s.nextDouble();

        double BMI = w/(ht*ht);
        System.out.println("Hello Sir...");
        System.out.println(" your BMI is "+BMI);

    }
}
