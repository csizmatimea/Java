package JavaCore;

public class Car {
    private String manufacturer;
    private String model;
    private String colour;
    private int passengerNumber;
    boolean selfDrive;

    public Car(String manufacturer, String model, String colour, int passengerNumber, boolean selfDrive) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.passengerNumber = passengerNumber;
        this.selfDrive = selfDrive;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public boolean isSelfDrive() {
        return selfDrive;
    }

    public void setSelfDrive(boolean selfDrive) {
        this.selfDrive = selfDrive;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", passengerNumber=" + passengerNumber +
                ", selfDrive=" + selfDrive +
                '}';
    }
}

