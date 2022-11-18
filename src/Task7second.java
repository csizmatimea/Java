import java.util.Random;
import java.util.Scanner;

public class Task7second {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(7);

        if (randomNumber == 3 || randomNumber == 4 || randomNumber == 5) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else if (randomNumber == 0 || randomNumber == 1 || randomNumber == 2 || randomNumber == 6) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        }

// Felhasználótól bekért számmal

        System.out.println("Add meg 1-7ig, hogy hányadik nap van ma");

        Scanner scanner = new Scanner(System.in);
        int daynumber = scanner.nextInt();


        if (daynumber == 4 || daynumber == 5 || daynumber == 6) {
            System.out.println("Italos nap van, ide a citromos sört de gyorsan");
        } else if (daynumber == 1 || daynumber == 2 || daynumber == 3 || daynumber == 7) {
            System.out.println("Ez nem a Te napod, majd talán holnap");
        }

    }
}