import java.util.Scanner;

public class fourth2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= in.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++ ){
            if(a[i+1]>a[i]){
                System.out.print(a[i+1] + " ");
            }
        }
    }
}
