package SecondClass;

import FirstLesson.Car;
import FirstLesson.ParkingLot;

import java.util.List;

public class ParkingBoy {
    public String park(Car car, ParkingLot parkingLot) {
        return parkingLot.park(car);
    }

    public Car pick(String token, ParkingLot parkingLot) {
        return parkingLot.pick(token);
    }

    public String park(Car car, List<ParkingLot> parkingLots) {
        for(ParkingLot parkingLot: parkingLots) {
            String token = parkingLot.park(car);
            if(token != null) {
                return token;
            }
        }
        return null;
    }
}
