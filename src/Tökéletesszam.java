import java.util.Scanner;

public class Tökéletesszam {
    /**
     * •	Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti,
     * hogy tökéletes szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adjon meg egy számot");
        int usernumber = scan.nextInt();
        int division = 0;
        int numberToEnd=0;

        for (int i = 1; i <= usernumber; i++) {
            division = usernumber % i;
            if (division == 0)
                numberToEnd= numberToEnd + i;
        }
        System.out.println(numberToEnd);

        if (division == usernumber * 2) {
            System.out.println("Ez egy tökéletes szám");
        } else {
            System.out.println("Ez nem egy tökéletes szám");
        }
    }
}
