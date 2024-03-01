package Pattern2;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=n;i++){
            for (int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            int x=1;
            for (int j=1;j<=i;j++){
                System.out.print(x+" ");
                x = x*(i-j)/j;
            }
            System.out.println();
        }
    }
}
