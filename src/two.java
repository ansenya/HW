import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[2 * n + 1][2 * n + 1];
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
            a[n+1-j][n+1-i] = i+j;
            }
        }
        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    } 
}
