import java.util.Scanner;

public class fourth2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = {5, 1, 5, 2, 4, 3};
        for (int i = 0; i < a.length - 1; i++ ){
            if(a[i+1]>a[i]){
                System.out.print(a[i+1] + " ");
            }
        }
    }
}
