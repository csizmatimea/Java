package JavaCore;

public class House {
    private int height;
    private int floorspace;
    private int numberOfFloors;
    private int NumberOfRooms;
    private String colourOfFaçade;


    public House(int height, int floorspace, int numberOfFloors, int NumberOfRooms, String colourOfFaçade) {
        this.height = height;
        this.floorspace = floorspace;
        this.numberOfFloors = numberOfFloors;
        this.NumberOfRooms = NumberOfRooms;
        this.colourOfFaçade = colourOfFaçade;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFloorspace() {
        return floorspace;
    }

    public void setFloorspace(int floorspace) {
        this.floorspace = floorspace;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfRooms() {
        return NumberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.NumberOfRooms = numberOfRooms;
    }

    public String getColourOfFaçade() {
        return colourOfFaçade;
    }

    public void setColourOfFaçade(String colourOfFaçade) {
        this.colourOfFaçade = colourOfFaçade;
    }

    @Override
    public String toString() {
        return "House{" +
                "Height: " + height +
                ", Floorspace: " + floorspace +
                ", Number of floors: " + numberOfFloors +
                ", Number of rooms: " + NumberOfRooms +
                ", Colour of façade: '" + colourOfFaçade + '\'' +
                '}';
    }
}
