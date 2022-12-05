import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task5metod {

    public static void main(String[] args) {
        List<String> usernames = scannNames();
        winName(usernames);
    }

    public static List<String> scannNames() {
        System.out.println("Give me 6 name please!");

        System.out.println("Give me 1. name please!");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        System.out.println("Give me 2. name please!");
        String name2 = scanner.nextLine();

        System.out.println("Give me 3. name please!");
        String name3 = scanner.nextLine();

        System.out.println("Give me 4. name please!");
        String name4 = scanner.nextLine();

        System.out.println("Give me 5. name please!");
        String name5 = scanner.nextLine();

        System.out.println("Give me 6. name please!");
        String name6 = scanner.nextLine();

        System.out.println("Köszönjük a megadott neveket! Most sorsolunk.");

        List<String> usernames = Arrays.asList(name1, name2, name3, name4, name5, name6);
        return usernames;

    }

    public static void winName(List<String> list) {
        String name1 = list.get(0);
        String name2 = list.get(1);
        String name3 = list.get(2);
        String name4 = list.get(3);
        String name5 = list.get(4);
        String name6 = list.get(5);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(6);

        if (randomNumber == 0) {
            System.out.println(name1);
        } else if (randomNumber == 1) {
            System.out.println(name2);
        } else if (randomNumber == 2) {
            System.out.println(name3);
        } else if (randomNumber == 3) {
            System.out.println(name4);
        } else if (randomNumber == 4) {
            System.out.println(name5);
        } else if (randomNumber == 5) {
            System.out.println(name6);
        }
    }
}



