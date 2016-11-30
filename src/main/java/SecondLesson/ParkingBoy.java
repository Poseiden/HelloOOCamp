package SecondLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;

import java.util.List;

public class ParkingBoy {
    private List<ParkingLot> parkingLots;

    public Car pick(String token) {
        for(ParkingLot parkingLot: parkingLots) {
            Car car = parkingLot.pick(token);
            if (car != null) {
                return car;
            }
        }
        return null;
    }

    public ParkingBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public String park(Car car) {
        for(ParkingLot parkingLot: parkingLots) {
            String token = parkingLot.park(car);
            if(token != null) {
                return token;
            }
        }
        return null;
    }
}
