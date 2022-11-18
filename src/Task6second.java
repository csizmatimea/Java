import java.util.Random;

public class Task6second {
    public static void main(String[] args) {
        String wisdom1 = "Aki korán kel, aranyat lel.";
        String wisdom2 = "Legbotorabb, ki nem kíván bölcsebb lenni, mint a milyen.";
        String wisdom3 = "Mindenki bírja a fájdalmat, kivéve azt, aki érzi.";
        String wisdom4 = "Ha a lehetőség nem kopogtat be hozzád, csinálj magadnak egy ajtót.";


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);

        if (randomNumber == 0) {
            System.out.println(wisdom1);
        } else if (randomNumber == 1) {
            System.out.println(wisdom2);
        } else if (randomNumber == 2) {
            System.out.println(wisdom3);
        } else if (randomNumber == 3) {
            System.out.println(wisdom4);
        }
    }
}