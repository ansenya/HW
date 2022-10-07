import java.util.Scanner;

public class AvgOf4Digit {
    public static int AvgOf4Digits(int[] a) {
        int s = 0, sch = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 999 && a[i] > 0 && a[i]<10000) {
                s += a[i];
                sch += 1;
            }
        }
        if (sch>0){
            return s/sch;
        }
        else return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[] a1 = new int [k];
        for (int i = 0; i < k; i++) {
            a1[i] = in.nextInt();
        }
        System.out.println(AvgOf4Digits(a1));
        }
}
