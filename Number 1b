import java.util.Random;

public class PassengerSource {
    private Company company;

    // Constructor
    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Random rand = new Random();
        // Generate random coordinates between 0-100
        int pickupX = rand.nextInt(101);
        int pickupY = rand.nextInt(101);
        int destX = rand.nextInt(101);
        int destY = rand.nextInt(101);

        Location pickup = new Location(pickupX, pickupY);
        Location destination = new Location(destX, destY);
        Passenger passenger = new Passenger(pickup, destination);

        // Schedule vehicle via Company
        return company.scheduleVehicle(passenger);
    }
}
