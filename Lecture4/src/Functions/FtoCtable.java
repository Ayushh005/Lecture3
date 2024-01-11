package Functions;

import java.util.Scanner;

public class FtoCtable {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");
        System.out.println("----------\t-------");

        for (int fahrenheit = -40; fahrenheit <= 120; fahrenheit += 20) {
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%8d\t%8.2f\n", fahrenheit, celsius);
        }
    }


}

