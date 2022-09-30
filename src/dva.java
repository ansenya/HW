import java.util.Scanner;

public class dva {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int v=2, k=11, s=0;
        int n = in.nextInt ();
        for(int i = 1; i<=n; ++i){
            if(i%2!=0){
                k=k*3;
            }
            else{
                k=k-10;
                s+=10;
                if (s%70==0){
                    v+=1;
                }
            }
        }
        System.out.println(v);
        System.out.println(k);

    }
}
