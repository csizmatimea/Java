

    import java.util.Random;

    public class Task31 {
        public static void main(String[] args)
        {
            int[] numbers = new int[100];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i+1;
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

        }
    }