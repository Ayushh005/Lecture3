package OperatorAndForLoop.ContinueBreak;

public class PatternBreak {
    public static void main(String[] args) {
        int n = 4;

        int i = 1;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print(i + " ");
                j++;
                if (j>i) {
                    break;
                }
            }
            System.out.println();
            i++;
        }
    }
}
