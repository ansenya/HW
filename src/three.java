import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer sc = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0){
                    a[i][j] = j+1;
                }
                if(j==n-1) {

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
