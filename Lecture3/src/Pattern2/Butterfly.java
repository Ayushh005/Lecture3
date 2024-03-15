package Pattern2;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;

        int i,j;
        for (i = 1;i<=n;i++){
            for (j=1;j<=i;j++){                      //  for star printing
                System.out.print("*");
            }
            int space = 2*(n-i);                     // for spaces between them
            for (j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){                      // for right side pattern
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (i=n-1;i>=1;i--){                          //  for reverse star printing
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            int space = 2*(n-i);                     //  for spaces
            for (j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){                       //  for right side pattern printing
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
