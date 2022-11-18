public class Task10second {

        public static void main(String[] args) {
        int number = 1;

        int cycle = 1;
        while (cycle <= 10) {
            number = number * cycle;
            cycle++;
        }
        System.out.println(number);

        int number2= 1;
        for (int cycle2=1; cycle2 <= 10; cycle2++) {
            number2 = number2 * cycle2;
        };
            System.out.println(number2);

    }
}
