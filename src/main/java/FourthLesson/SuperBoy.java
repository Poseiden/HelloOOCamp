package FourthLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import ThirdLesson.Boy;
import ThirdLesson.SmartBoy;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SuperBoy {
    private List<ParkingLot> parkingLots = Lists.newArrayList();
    public SuperBoy(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public String park(Car car) {
        Collections.sort(parkingLots, new Comparator<ParkingLot>() {
            @Override
            public int compare(ParkingLot o1, ParkingLot o2) {
                double result = o2.getEmptyRate() - o1.getEmptyRate();
                if(result > 0) {
                    return 1;
                } else if (result == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        return parkingLots.get(0).park(car);
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
}
