import static org.junit.Assert.*;
import org.junit.Test;

public class CompanyTest {
    @Test
    public void testScheduleVehicle_Available() {
        Company company = new Company();
        company.addVehicle(new Vehicle(true)); // Assume method to add vehicles
        Passenger passenger = new Passenger(new Location(0,0), new Location(1,1));
        assertTrue(company.scheduleVehicle(passenger));
    }

    @Test
    public void testScheduleVehicle_Unavailable() {
        Company company = new Company();
        company.addVehicle(new Vehicle(false)); // No available vehicles
        Passenger passenger = new Passenger(new Location(0,0), new Location(1,1));
        assertFalse(company.scheduleVehicle(passenger));
    }
}
