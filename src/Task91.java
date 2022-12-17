import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Task91 {
    /**
     * A feladat, hogy készítsünk egy programot, ami értesít minket arról,
     * hogyha valamelyik komponensből 50%, vagy annál kevesebb van,
     * és szól, hogy vegyünk belőle annyit amennyi hiányzik az ajánlott mennyiség eléréséhez.
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> foodList;
        try {
            foodList = Files.readAllLines(Paths.get(args[0]));
            // System.out.println(foodList.size());
            // System.out.println(foodList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Listelementscut(foodList);
    }

    public static void Listelementscut(List<String> foodList) {
        foodList.remove(0); //címsort kivesszük
        int amount = 0;
        int required = 0;
        String foodName = "";

        System.out.println(foodList);

        for (String food : foodList) {
            // String newfood=food.replaceAll(" ", "");

            String[] rowArray = food.split(","); // 3 eleme van  a tömbnek
            System.out.println(rowArray);
            foodName = rowArray[0].trim();
            amount = Integer.parseInt(rowArray[1].trim());
            required = Integer.parseInt(rowArray[2].trim());

            if(amount<=required/2)
                System.out.println("Your " + foodName +"amunt less than a required 50%. Please buy: " + (required-amount));
        }
    }
}


