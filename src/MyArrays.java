import java.util.Arrays;
import java.util.Scanner;


public class MyArrays {
    public static int AvgOf4Digits(int[] a) {
        int s = 0, sch = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 999 && a[i] > 0 && a[i]<10000) {
                s += a[i];
                sch += 1;
            }
        }
        if (sch>0){
            return s/sch;
        }
        else return -1;
    }

    public static int[] MinToBegin (int[] a){
        int min = 1_000_000_001, minInd=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minInd = i;
            }
        }
        for (int i = minInd; i > 0; i--) {
            a[i]=a[i-1];
        }
        a[0]=min;
        if (minInd != -1){
            return a;
        }
        else {
            System.out.println(-1);
            return a;
        }
    }

}
