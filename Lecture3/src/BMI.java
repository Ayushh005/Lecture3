import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Height=");
        double h = s.nextDouble();
        double ht = h/100;
        System.out.println("Weight=");
        double w = s.nextDouble();

        double BMI = w/(ht*ht);
        System.out.println("BMI="+BMI);

    }
}
