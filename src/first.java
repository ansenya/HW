import java.util.Scanner;

public class first {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int scht = 0, b = a;
        int ch = in.nextInt();
        int[] cif = new int [10];
        while (a!=0){
            a=a/10;
            scht++;
        }
        int[] mas = new int [scht];
        for (int i = 0; i < scht; i++) {
            mas[i] = b%10;
            b=b/10;
        }
        for (int i = scht-1; i >= 0; i--) {
            if (mas[i]!=ch){
                System.out.print(mas[i]);
            }
        }
    }
}
