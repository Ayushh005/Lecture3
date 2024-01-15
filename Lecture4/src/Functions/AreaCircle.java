package Functions;

import java.util.Scanner;

public class AreaCircle {
    public static double FindArea(double r) {
        double area = r*r*3.14;
        return area;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle (cm) = ");
        double r = s.nextDouble();
        double c = FindArea(r);
        System.out.println(c+"cm");
    }
}
