import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task92 {
    public static void main(String[] args) throws IOException {
        List<String> bookList = null;
        try {
            bookList = bookfromFile();
        } catch (IOException e) {
            System.out.println("Can not find books.txt");
        }


        HashMap<String, Integer> bookCountMap = new HashMap<>();

        for (String bookTitle : bookList) {
            if (bookCountMap.containsKey(bookTitle)) {
                int originalCount = bookCountMap.get(bookTitle);
                bookCountMap.put(bookTitle, originalCount + 1); // felülírom a könyv darabszámát
            } else {
                bookCountMap.put(bookTitle, 1);
            }
        }

        // task d - foreach to override books with 4 count to 3
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if (bookCountMap.containsValue(4))
                bookCountMap.put((String) mapElement.getKey(), 3);
        }

        // task c - foreach to collect books with 1 count
        List<String> bookWithCountOne = new ArrayList<>();
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            if ((int) mapElement.getValue() == 1) {
                bookWithCountOne.add((String) mapElement.getKey());
            }
        }

        // task c - foreach to remove saved books with 1 count
        for (String bookTitle : bookWithCountOne) {
            bookCountMap.remove(bookTitle);
        }

        // task b - foreach for sums
        int sumOfBooks = 0;
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            sumOfBooks += (int) mapElement.getValue();
        }

        // task a - foreach for println
        for (Map.Entry mapElement : bookCountMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " darab");
        }

        printAndToFile(bookCountMap,bookList, sumOfBooks);

    }

    public static void printAndToFile (Map bookCountMap, List bookList, int sumOfBooks ){

      /*  for (Path path : Files.writeString("src/resources/books.Count.txt")) {
            System.out.println("Number of different titles: " + bookCountMap.size());
            System.out.println("Total number of books (from List): " + bookList.size());
            System.out.println("Total number of books (from Map): " + sumOfBooks);
        }
*/


    }
    public static List bookfromFile() throws IOException {
        List<String> bookList = Files.readAllLines(Paths.get("src/resources/books.txt"));
        return bookList;
    }
}
