package JavaCore;

public class FamilyHouse extends House {

    int sizeOfTheGarden;

    public FamilyHouse(int height, int floorspace, int numberOfFloors, int NumberOfRooms, String colourOfFaçade, int sizeOfTheGarden) {
        super(height, floorspace, numberOfFloors, NumberOfRooms, colourOfFaçade);
        this.sizeOfTheGarden = sizeOfTheGarden;
    }

    public int getSizeOfTheGarden() {
        return sizeOfTheGarden;
    }

    public void allInformation() {
        System.out.println(getHeight() + " " + getFloorspace() + " " + getNumberOfFloors() + " " + getNumberOfRooms() + " " + getColourOfFaçade() + " " + getSizeOfTheGarden());

    }
}
