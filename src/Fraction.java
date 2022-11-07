public class Fraction {

    public static double numerator = 0;
    public static double denominator = 1;


    public static double sum(){

        return 0d;
    }

    Fraction(double numerator, double denominator) { // added
        this.numerator = numerator;
        this.denominator=denominator;
        System.out.println(this.numerator);
        System.out.println(this.denominator);
    }

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        normalize();
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = (int)(numerator);
        int b = (int)(denominator);
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public void normalize() { // НОД - Наибольший Общий Делитель и НОК - Наименьшее Общее Кратное
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }
}
