import java.util.Scanner;

public class SumOfSeven {

    public static int NumberDigits(int a, int b){
        int ch, s, os = 0;
        for (int i = a; i <= b; i++) {
            s=0;
            if (i%7==0 && i>9 && i<100) {
                ch = i;
                while (ch != 0) {
                    s += ch % 10;
                    ch /= 10;
                }
                os+=s;
            }
        }
    return os;
    }

    public static void main(String[] args) {
        int a1, b1;
        Scanner in = new Scanner(System.in);
        a1 = in.nextInt();
        b1 = in.nextInt();
        System.out.println(NumberDigits(a1, b1));

    }
}
