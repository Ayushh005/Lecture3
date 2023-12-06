import java.util.Scanner;
class Test
{
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       char name = s.next().charAt(4);
       float m1,m2,m3;
       m1=s.nextFloat();
       m2=s.nextInt();
       m3=s.nextInt();
       float avg = (m1+m2+m3)/3;
        System.out.println(name);
        System.out.println("Average = "+avg);
    }
}