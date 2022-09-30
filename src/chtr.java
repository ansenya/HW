import java.util.Scanner;

public class chtr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b, c=0, min=1000000000;
        int ch=1;
        int st=10;
        b= (int) n;
        while (n>1){
            n= (int) (n/Math.pow(st, ch));
            ch+=1;
        }
        for (int i = 1; i<=ch+1;++i){
            c=b%10;
            b= (int) (b/10);
            if (c<min){
                min = c;
            }
        }
        System.out.println(min);
    }
}
