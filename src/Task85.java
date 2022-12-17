
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task85 {

    public static void main(String[] args) {
        //  System.out.println(printArgConsole());


        boolean again = true;

        do {
            try {
                printArgthrows();
                again = false;
            } catch (InputMismatchException ex) {
                System.out.println("Hey, there is no such an index in the array!");
            }
        } while (again);
    }

    public static int printArgConsole() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");

        int usernumber = 0;
        try {
            usernumber = scanner.nextInt();
            System.out.println(usernumber);
        } catch (InputMismatchException ex) {
            System.out.println("You added a text, only number please!");
        }
        return usernumber;
    }

    public static int printArgthrows() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int usernumber = 0;
        System.out.println("Give me a number");
        usernumber = scanner.nextInt();
        System.out.println(usernumber);

        return usernumber;
    }
}


