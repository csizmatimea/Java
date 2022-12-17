package JavaCore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int bookingCount = Integer.parseInt(args[0]);
        List<Booking> booking = new ArrayList<>();


        for (int a = 0; a < bookingCount; a++) {

            System.out.println("Please enter your name:");
            String name = scanner.nextLine();

            System.out.println("Please enter your date of arrival :");
            String checkInDate = scanner.nextLine();

            System.out.println("Please enter the date of departure:");
            String checkOutDate = scanner.nextLine();

            System.out.println("Please enter how many person come:");
            int numberOfGuests = scan.nextInt();

            System.out.println("Please enter your phone number");
            int phoneNumber = scan.nextInt();


            if (name.isEmpty() || checkInDate.isEmpty() || checkOutDate.isEmpty()) {
                System.out.println("The email, name, and birth date must not be empty!");
                System.exit(0);
            }

            Booking passenger = new Booking(name, checkInDate, checkOutDate, numberOfGuests);



            booking.add(passenger); //fentebbi Booking osztályú listába teszi a passenger adatait
            for (int i = 0; i < booking.size(); i++)
                System.out.println(booking.get(i));

            System.out.println(passenger);
        }
    }
}

