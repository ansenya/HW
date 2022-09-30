import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1, b=1, c=0;
        int n = in.nextInt ();
        for (int i= 1; i<n-1; ++i){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}