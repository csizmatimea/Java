package JavaCore;

import java.util.*;
import java.util.stream.IntStream;

public class HouseMain {
    public static void main(String[] args) {
        //példányok
        House biteStreet = new House(10, 100, 3, 5, "white");
        House spacingStreet = new House(6, 150, 1, 4, "pink");
        House headingStreet = new House(100, 800, 10, 400, "green");

        //listába mennek

        List<House> houses = Arrays.asList(biteStreet,spacingStreet,headingStreet);
        System.out.println(houses);

        // Tömbben tárolva

        House[] housesArray = new House[3];
        housesArray[0] = biteStreet;
        housesArray[1] = spacingStreet;
        housesArray[2] = headingStreet;

        System.out.println(housesArray[0]);
        System.out.println(housesArray[1]);
        System.out.println(housesArray[2]);
    }
}
