package ThirdLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import com.google.common.collect.Lists;

import java.util.List;

//todo abstract
public class Boy {
    private List<ParkingLot> parkingLots = Lists.newArrayList();

    public Boy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public Car pick(String token) {
        for (ParkingLot parkingLot: parkingLots) {
            Car car = parkingLot.pick(token);
            if(car != null) {
                return car;
            }
        }
        return null;
    }

    protected List<ParkingLot> getParkingLots() {
        return this.parkingLots;
    }
}
