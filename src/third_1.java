import java.util.Scanner;

public class third_1 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = {5, 5, -4, 3, -2, 1};
        int max = 999999999;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>0 & a[i]<max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
