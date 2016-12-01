package ThirdLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;

import java.util.Collections;
import java.util.List;

public class SmartBoy extends Boy {

    public String park(Car car) {
        Collections.sort(super.getParkingLots(), (o1, o2) -> o2.getEmptyLots() - o1.getEmptyLots());

        ParkingLot parkingLot = super.getParkingLots().get(0);
        return parkingLot.park(car);
    }

    public SmartBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

}
