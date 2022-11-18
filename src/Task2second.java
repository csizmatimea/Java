import java.util.Random;
import java.util.Scanner;

public class Task2second {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int anumber = randomGenerator.nextInt(100);
        System.out.println("A number:" + anumber);

        int bnumber = randomGenerator.nextInt(100);
        System.out.println("B number:" + bnumber);

        if (anumber > bnumber) {
            int remainder = anumber % bnumber;
            System.out.println("Remainder:" + remainder);
        } else {
            int remainder = bnumber % anumber;
            System.out.println("Remainder:" + remainder);
        }

        // Felhasználótól bekérés b,

        System.out.println(" Give me a number!");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println(" Give me an other number!");
        int number2 = scanner.nextInt();

        int remainder2 = number1 % number2;
        System.out.println("Remainder:" + remainder2);

    }

}
