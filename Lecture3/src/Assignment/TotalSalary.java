package Assignment;
import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        System.out.print("Basic Salary = ");
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        System.out.print("Enter Grade = ");
        char grade = s.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;
        int allowance;
        if (grade == 'A') {
             allowance = 1700;
        } else if (grade == 'B') {
            allowance = 1500;
        }
        else  {
            allowance = 1300;
        }
        double TS = basic + hra + grade + da + allowance - pf;
        int ans = (int) Math.round(TS);
        System.out.println("Total Salary = " + ans);
    }
}
