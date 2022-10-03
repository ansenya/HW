import java.util.Scanner;

public class sec {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ch=0, b = a, sh=0;
        while(a!=0){
            a=a/10;
            ch++;
        }
        int[] mas = new int[ch];
        mas[0]=b%10;
        b=b/10;
        for (int i = 1; i < ch; i++) {
            if(b>0){
                mas[i]=b%10;
                b=b/10;
            }
            else{
                mas[i]=-b%10;
                b=b/10;
            }
        }
        if (mas[0]!=0) System.out.print(mas[0]);
        for (int i = 1; i < ch; i++) {
            System.out.print(mas[i]);
        }
    }
}
