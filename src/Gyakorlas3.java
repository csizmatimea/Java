import java.util.Random;

public class Gyakorlas3 {
    /**
     * •	 Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja,
     * hogy a 9-es számjegyből hány darabot tartalmaz (ne alakítsa át sztringgé/karaktertömbbé)!
     *
     * @param args
     */
    public static void main(String[] args) {


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(99) + 1;
        System.out.println(randomNumber);

        int lastDigit = randomNumber % 10;
        int firstDigit = (randomNumber - lastDigit) / 10;
        int pieceOfNine = 0;

        if (lastDigit == 9)
           pieceOfNine=pieceOfNine+1;

        if (firstDigit == 9)
        pieceOfNine=pieceOfNine+1;

        System.out.println(lastDigit);
        System.out.println(firstDigit);
        System.out.println(pieceOfNine);

    }
}