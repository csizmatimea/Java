package JavaCore;

public class AnikoHous {
    public static void main(String[] args) {
        House houseA = new House(15, 100, 3, 6, "pink");
        FamilyHouse houseAniko = new FamilyHouse(10, 80, 2, 3, "white", 700);

        System.out.println(houseA.toString());
        houseAniko.allInformation();
    }
}
