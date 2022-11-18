import java.util.Scanner;

public class Task12second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int result = 0;
        int gmoney = 0;
        int bmoney= 0;
        boolean allowInputFlag = true;

        while (allowInputFlag) {
            System.out.println("what color glass do you give?");
            String glasscolor = scanner.nextLine();

            if (glasscolor.equals("green")) {
                gmoney = gmoney + 10;

            } else if (glasscolor.equals("black")) {
                bmoney = bmoney + 30;
            } else {
                System.out.println("Incorrect answer");
            }

            System.out.println("If you are finish press X, otherwise press y");
            String xy = scanner2.nextLine();

            if (xy.equals("x"))
                allowInputFlag = false;

        }

        result= gmoney+bmoney;
        System.out.println("You got " + result + "Ft");
    }
}
