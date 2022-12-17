import java.util.Scanner;

public class Task86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Give me a text minimum 10 characters");
            String useranwer = scanner.nextLine();
            String caracter = String.valueOf(useranwer.charAt(9));
            System.out.println(caracter);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Too short, enter a minimum of 10 characters");

        }
    }
}