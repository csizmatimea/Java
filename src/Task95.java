import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task95 {
    public static void main(String[] args) {

        try {
            Files.writeString(Path.of("src/resources/triangleResults.log"), "" );
        } catch (IOException e) {
            System.out.println("The file was not found.");;
        }

        List<String > sides = new ArrayList<>();

        try {
            sides = Files.readAllLines(Path.of("src/resources/triangleExamples.txt"));
        } catch (IOException e) {
            System.out.println("The file was not found.");
        }

        for(String sidesElement : sides) {
            String content = getContentString(sidesElement);

            try {
                Files.writeString(Path.of("src/resources/triangleResults.log"), content + System.lineSeparator(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("The file was not found.");;
            }
        }
    }

    public static String getContentString(String sidesElement) {
        String[] trianlgeSides = sidesElement.split(",");
        int aoldal = Integer.parseInt(trianlgeSides[0]);
        int boldal = Integer.parseInt(trianlgeSides[1]);
        int coldal = Integer.parseInt(trianlgeSides[2]);

        String content = aoldal + " " + boldal + " " + coldal + " - " + writeTriangleOrNot(aoldal, boldal, coldal);
        return content;
    }

    public static String writeTriangleOrNot(int aoldal, int boldal, int coldal) {

        if ((aoldal + boldal) > coldal &&
                (aoldal + coldal) > boldal &&
                (boldal + coldal) > aoldal) {
            return "Triangle";
        } else {
            return "Not a triangle";
        }
    }
}