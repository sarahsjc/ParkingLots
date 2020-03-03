import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ParkingLotsTest {

    private ParkingBoy parkingBoy;
    private List<ParkingLot> parkingLots;

    @Before
    public void setup(){
        this.parkingBoy = new ParkingBoy();
        parkingLots = Arrays.asList(new ParkingLot(1), new ParkingLot(2));
        parkingBoy.setParkingLots(parkingLots);
    }

    @Test
    public void testParkCarSuccessfullyIfLot1isAvailable()
    {
        Car car = new Car();
        try {
            Ticket ticket = parkingBoy.parkCar(car);
            assertEquals(parkingLots.get(0).getCar(ticket), car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParkFailedIfLotsIsNotAvailable() {
        List<Car> cars = Arrays.asList(new Car(), new Car(), new Car(), new Car());
        for (Car car: cars) {
            parkingBoy.parkCar(car);
        }

        assertNull(parkingBoy.parkCar(new Car()));
    }
}