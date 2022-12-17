import java.util.Random;
import java.util.Scanner;

public class Gyakorlas4 {
    /**
     * Írjon függvényt vagy metódust, mely valós típusú paraméterének azt a számjegyét adja vissza,
     * amelyik a tizedes pont után áll! (a megoldás során ne használjon sztringeket/karaktertömböket)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a fraction");

        double number = scanner.nextDouble();

        double lastDigit = number % 10;
        double lastDigitTenTimes = lastDigit * 10;
        double lastDigitFraction = lastDigitTenTimes % 10;
        double b =Math.sqrt(lastDigitFraction);
        int lastnumber= ((Double) b).intValue();
       


        System.out.println(number);
        System.out.println(lastDigit);
        System.out.println(lastDigitTenTimes);
        System.out.println(lastDigitFraction);
        System.out.println(lastnumber);


    }
}