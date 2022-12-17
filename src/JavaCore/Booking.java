package JavaCore;

public class Booking {

    private String name;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfGuests;
    private int phoneNumber;

    public Booking(String name, String checkInDate, String checkOutDate, int numberOfGuests) {
        this.name = name;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuests = numberOfGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "Name='" + name + '\'' +
                ", Chek in date='" + checkInDate + '\'' +
                ", Check out date='" + checkOutDate + '\'' +
                ", Number of guests=" + numberOfGuests +
                ", Phone number=" + phoneNumber +
                '}';
    }
}


