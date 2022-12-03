import java.util.Scanner;

public class Main  {
    public static void main (String[] args) {


        Scanner in = new Scanner(System.in);
        Trinnity trinnity = new Trinnity<>(in.next(), in.next(), in.next());

        System.out.println(trinnity);
    }
}