package SecondLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import ThirdLesson.Boy;

import java.util.List;

public class ParkingBoy extends Boy {

    public ParkingBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
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
