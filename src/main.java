import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        teacher volkov = new teacher();
        volkov.name = "Волков";
        volkov.age = 50;
        volkov.lesson = "математику";
        volkov.meow();

        teacher peklash = new teacher();
        peklash.name = "Пекляш";
        peklash.age = 69;
        peklash.lesson = "физику";
        peklash.meow();

        head head = new head();
        head.age= 99;
        head.name="Мазурина";
        head.lesson="ничего";
        head.rank="директор";
        head.meow();

        pupils pupil = new pupils();
        pupil.age=16;
        pupil.setGrade(10);
        pupil.meow();
    }

}