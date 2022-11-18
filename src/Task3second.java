import java.util.Random;
import java.util.Scanner;

public class Task3second {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int anumber = randomGenerator.nextInt(10);
        System.out.println("A number:" + anumber);

        int bnumber = randomGenerator.nextInt(10);
        System.out.println("B number:" + bnumber);

        int product= anumber*3*bnumber;
        System.out.println("Product:" + product);

        // bekérem a számpkat

        System.out.println(" Give me a number!");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println(" Give me an other number!");
        int number2 = scanner.nextInt();

        int product2 = number1 *3 * number2;
        System.out.println("Product2:" + product2);


    }
}
