import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result = String.valueOf(n);
        n = n % 10;
        switch (n) {
            case 0:
                result += " TORTOV";
            case 1:
                result += " TORT";
                break;
            case 2:
                result += " TORTA";
                break;
            case 3:
                result += " TORTA";
                break;
            case 4:
                result += " TORTA";
                break;
            case 5:
                result += " TORTOV";
                break;
            case 6:
                result += " TORTOV";
                break;
            case 7:
                result += " TORTOV";
                break;
            case 8:
                result += " TORTOV";
                break;
            case 9:
                result += " TORTOV";
                break;
            default:
                result = " ERROR";
        }
        System.out.println(result);
    }
}
