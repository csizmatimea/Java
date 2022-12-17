import java.util.Random;
import java.util.Scanner;

public class JavaFeladat2 {
    /**
     * Írj számkitalálós játékot! A gép „gondoljon” egy véletlen számra 1 és 100 között, majd a konzolról
     * beolvasott tippekre reagáljon „kisebb”, „nagyobb” vagy „eltaláltad” konzol üzenettel (nyilván mindig
     * a megfelelővel!). A sikeres találat után a program megáll, de újbóli indításkor (valószínűleg) másik
     * véletlen számra „gondol”.
     */

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100) + 1;
        System.out.println(randomNumber);

        Scanner scan = new Scanner(System.in);
        Scanner scaner = new Scanner(System.in);
        boolean again = true;

        do {
            System.out.println("Adjon meg egy számot");
            int usernumber = scan.nextInt();

            if (usernumber < randomNumber) {
                System.out.println("A számod kisebb a gondolt számnál");

            } else if (usernumber > randomNumber) {
                System.out.println("A számod nagyobb a gondolt számnál");
            } else {
                System.out.println("Eltaláltad a számot! Ha szeretnéd újra kezdeni, nyomj x-et");
                String x= scaner.nextLine();

                if (!x.equals("x"))
                    again = false;
            }
        } while (again);
    }
}
