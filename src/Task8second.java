import java.util.Scanner;

public class Task8second {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle");

        System.out.println("Give me the first side:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Give me the second side:");
        int number2 = scanner.nextInt();

        System.out.println("Give me the third side:");
        int number3 = scanner.nextInt();

        if ((number1*number2 >= number3) || (number2* number3 >= number1) || (number1 *number3 >=number2)) {
            System.out.println("You are lucky person.");
        } else {
            System.out.println("Please, try again.");
        }
    }
}
