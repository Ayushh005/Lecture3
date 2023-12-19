package Pattern2;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.print("Pattern Size = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int firsthalf = (n + 1) / 2;
        int secondhalf = (n / 2);

        int i = 1;
        while (i <= firsthalf) {
            int space = 1;
            while (space <= firsthalf - i) {
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= (2 * i) - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
            //   Second half

            i = secondhalf;

            while (i >= 1) {
                int space = 1;
                while (space <= (secondhalf - i + 1)) {
                    System.out.print(" ");
                    space++;
                }
                int j = 1;
                while (j <= (2 * i) - 1) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i--;
            }
        }
    }

