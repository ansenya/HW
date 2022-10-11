import java.util.Scanner;

public class three {
    public three() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer sc = 0;
        int[][] a = new int[n][n];

        int i;
        int j;
        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                if (i == 0) {
                    a[i][j] = j + 1;
                }

                if (j == n - 1) {
                    a[i][j] = n - j;
                }
            }
        }

        for(i = 0; i < n; ++i) {
            for(j = 0; j < n; ++j) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

    }
}
