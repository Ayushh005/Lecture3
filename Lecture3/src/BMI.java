import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Name=");
        String name = s.next();
        System.out.print("Height=");
        double h = s.nextDouble();
        double ht = h/100;
        System.out.print("Weight=");
        double w = s.nextDouble();

        double BMI = w/(ht*ht);
        System.out.println("Hello " + name);
        System.out.println(" your BMI is "+BMI);



    }
}
