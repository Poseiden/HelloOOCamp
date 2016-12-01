package FourthLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import ThirdLesson.Boy;

import java.util.Collections;
import java.util.List;

public class SuperBoy extends Boy{
    public SuperBoy(List<ParkingLot> parkingLots) {
        super(parkingLots);
    }

    public String park(Car car) {
        Collections.sort(parkingLots, (o1, o2) -> {
                double result = o2.getEmptyRate() - o1.getEmptyRate();
                if(result > 0) {
                    return 1;
                } else if (result == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        );
        return parkingLots.get(0).park(car);
    }
}
