import java.util.Random;
import java.util.Scanner;

public class Task4second {
    public static void main(String[] args) {
        System.out.println("Heads or tails?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);

        String computerChoose;
        if (randomNumber == 0) {
            computerChoose = "head";
        } else {
            computerChoose = "tails";
        }

        if (answer.equals(computerChoose)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");

        }

    }
}
