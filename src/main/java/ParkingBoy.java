import java.util.List;

public class ParkingBoy {
    List<ParkingLot> parkingLots;

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    Ticket parkCar (Car car)  {
        for(ParkingLot parkingLot: parkingLots ) {
            try {
                return parkingLot.parkCar(car);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }

        return null;
    }


}
