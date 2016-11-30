package SecondLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class ParkingBoyTest {

    @Test
    public void should_pick_car_successful_when_parking_boy_park_it() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy(Lists.newArrayList(parkingLot));

        String token = parkingBoy.park(car);

        assertThat(parkingLot.pick(token), sameInstance(car));
    }

    @Test
    public void should_parking_boy_pick_car_successfully_when_park_it() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy(Lists.newArrayList(parkingLot));

        String token  = parkingLot.park(car);

        assertThat(parkingBoy.pick(token), sameInstance(car));
    }

    @Test
    public void should_parking_boy_pick_car_successfully_when_parking_boy_park_it() throws Exception {
        ParkingLot parkLot = new ParkingLot(1);
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy(Lists.newArrayList(parkLot));

        String token = parkingBoy.park(car);

        assertThat(parkingBoy.pick(token), sameInstance(car));
    }

    @Test
    public void should_pick_car_successfully_from_second_parking_lot_when_parking_boy_park_it_and_first_parking_lot_is_full() throws Exception {
        ParkingLot firstParkLot = new ParkingLot(1);
        firstParkLot.park(new Car());
        ParkingLot secondParkLot = new ParkingLot(1);
        ParkingBoy parkingBoy = new ParkingBoy(Lists.newArrayList(firstParkLot, secondParkLot));
        Car car = new Car();

        String token = parkingBoy.park(car);

        assertNull(firstParkLot.pick(token));
        assertThat(secondParkLot.pick(token), sameInstance(car));
    }
}
