import java.util.Scanner;

public class fourth {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int a = -99999;
        String b = "";
        while (a!=0){
            a = in.nextInt();
            if (a>c){
                b+=a;
                b+= " ";
            }
            c=a;
        }
        System.out.println(b);
    }
}
