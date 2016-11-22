package SecondClass;

import FirstLesson.Car;
import FirstLesson.ParkingLot;

public class ParkingBoy {
    public String park(Car car, ParkingLot parkingLot) {
        return parkingLot.park(car);
    }

    public Car pick(String token, ParkingLot parkingLot) {
        return parkingLot.pick(token);
    }
}
