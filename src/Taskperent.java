import java.util.Random;
import java.util.random.RandomGenerator;

public class Taskperent {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int play = randomGenerator.nextInt(6);


        switch (play) {
            case 0:
                System.out.println(" mother");
                System.out.println(" Rajz");
                break;
            case 1:
                System.out.println(" mother");
                System.out.println(" Festés");
                break;
            case 2:
                System.out.println(" mother");
                System.out.println(" olvasás");
                break;
            case 3:
                System.out.println(" father");
                System.out.println(" foci");
                break;
            case 4:
                System.out.println(" father");
                System.out.println(" Duna part");
                break;
            case 5:
                System.out.println(" father");
                System.out.println(" kirándulás");
                break;

        }
    }
}