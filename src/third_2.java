import java.util.Scanner;

public class third_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int max = 999999999;
        int a = in.nextInt();
        while (a!=0){
            if (a > 0 & a<max) {
                max=a;
            }
            a = in.nextInt();
        }

        System.out.println(max);
    }
}
