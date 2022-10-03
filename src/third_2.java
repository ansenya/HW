import java.util.Scanner;

public class third_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int max = 999999999;
        int a = in.nextInt();
        while (a!=0){
            a = in.nextInt();
            if (a > 0 & a<max) {
                max=a;
            }
        }

        System.out.println(max);
    }
}
