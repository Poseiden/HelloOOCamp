package ThirdLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmartBoy {
    private List<ParkingLot> parkingLots = Lists.newArrayList();

    public String park(Car car) {
        Collections.sort(parkingLots, new Comparator<ParkingLot>() {
            @Override
            public int compare(ParkingLot o1, ParkingLot o2) {
                return o2.getEmptyLots() - o1.getEmptyLots();
            }
        });

        ParkingLot parkingLot = parkingLots.get(0);
        return parkingLot.park(car);
    }

    public Car pick(String token, ParkingLot parkingLot) {
        return parkingLot.pick(token);
    }

    public SmartBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }
}
