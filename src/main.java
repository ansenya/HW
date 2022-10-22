import java.util.Scanner;

/*
я понимаю, что сделать нужно следующее:
каждая ячейка массива состоит из 1 байта, что равно 8 битам, а это значит, что получив на вход True/False в какой-то
последовательности, я должен их записать, как 1010111 (1 = true; 0 = false),
и, получается, в каждой ячейке массива хранится такое бинарное число.
тем не менгее, реализовать у меня не получается, хотя я приблизился к решению довольно близко, как мне кажется.
 */

public class main {

    public static int trans2to10(int num){
        int per=0;
        double i = 0;
        while (num>0){
            per=per+(int)((num%10)*Math.pow(2.0, i));
            num=num/10;
            i++;
        }
        return per;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), znach = 0, k=1, a2, ind1    = 0, ind2 = 0;
        String a;
        char a1;
        int[] bytecode = {0000001, 0000010; 0000100, 0001000, 0010000, 0100000, 1000000};
        byte[] bool = new byte[7+(n/8)*7];

        for (int i = 0; i < n; i++) {
            a = in.next();
            if (a == "true") {
                bool[ind1] = (byte)bytecode[ind2];
                ind2++;
            }
            if (ind2>7){
                ind2=0;
                ind1++;
            }
        }
    }
}
