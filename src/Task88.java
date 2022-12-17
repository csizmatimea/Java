
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task88 {
    /**
     *
     */
    public static void main(String[] args) {



        List<String> namesList = new ArrayList<>();
        try {
            namesList = Files.readAllLines(Path.of("src/resources/sport"));
        } catch (IOException e) {
            System.out.println("I can't find the file that you request.");
        }
        System.out.println("File data: " + namesList);

        try {


            if (namesList.contains(args[0]))
                System.out.println("It’s in the file");
            else
                System.out.println("No luck");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no");
        }
        }
    }
