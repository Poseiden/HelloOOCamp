package FourthLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.*;

public class SuperBoyTest {
    @Test
    public void should_park_the_car_to_the_highest_empty_rate_of_parking_lot_when_park_it() {
        ParkingLot firstParkingLot = new ParkingLot(2);
        firstParkingLot.park(new Car());
        ParkingLot secondParkingLot = new ParkingLot(2);
        SuperBoy superBoy = new SuperBoy(Lists.newArrayList(firstParkingLot, secondParkingLot));
        Car car = new Car();

        String token = superBoy.park(car);

        assertThat(secondParkingLot.pick(token), sameInstance(car));
    }
}