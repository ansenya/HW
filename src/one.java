import java.util.Scanner;
public class one {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][]=new int [n][m];
        int q = 0;
        int k = 0;
        for (int i = 0; i < n*m; i++) {
            a[q][k] = q*k;
            k++;
            if (k>m-1) k = 0;
            if ((i+1)%m == 0) q++;
        }
    }
}