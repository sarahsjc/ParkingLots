import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    int id;
    int capacity;
    Map<Ticket, Car> cars;

    public ParkingLot(int id) {
        this.id = id;
        this.cars = new HashMap<>();
        capacity = 2;
    }

    Ticket parkCar(Car car) throws Exception {
        if (capacity<= 0) {
            throw new Exception();
        }
        capacity--;
        Ticket ticket = new Ticket(id);
        cars.put(ticket, car);
        return ticket;
    }

    Car getCar(Ticket ticket) {
        capacity++;
        return cars.get(ticket);
    }
}
