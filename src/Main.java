import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        s=s+(n%10)+((n/10))%10+n/100;
        System.out.print(s);
        System.out.print(" ");
        System.out.println( (n%2==0) ? (n+2) : n+1 );
    }
}