package ThirdLesson;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import com.google.common.collect.Lists;
import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SmartBoyTest {
    @Test
    public void should_pick_car_successful_when_parking_boy_park_it() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        SmartBoy smartBoy = new SmartBoy(Lists.newArrayList(parkingLot));

        String token = smartBoy.park(car);

        assertThat(parkingLot.pick(token), sameInstance(car));
    }

    @Test
    public void should_parking_boy_pick_car_successfully_when_park_it() {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        SmartBoy smartBoy = new SmartBoy(Lists.newArrayList(parkingLot));

        String token  = parkingLot.park(car);

        assertThat(smartBoy.pick(token, parkingLot), sameInstance(car));
    }

    @Test
    public void should_parking_boy_pick_car_successfully_when_parking_boy_park_it() {
        ParkingLot parkLot = new ParkingLot(1);
        Car car = new Car();
        SmartBoy smartBoy = new SmartBoy(Lists.newArrayList(parkLot));

        String token = smartBoy.park(car);

        assertThat(smartBoy.pick(token, parkLot), sameInstance(car));
    }

    @Test
    public void should_pick_car_successfully_from_second_parking_lot_when_parking_boy_park_it_and_first_parking_lot_is_full() {
        ParkingLot firstParkLot = new ParkingLot(1);
        firstParkLot.park(new Car());
        ParkingLot secondParkLot = new ParkingLot(1);
        SmartBoy smartBoy = new SmartBoy(Lists.newArrayList(firstParkLot, secondParkLot));
        Car car = new Car();

        String token = smartBoy.park(car);

        assertNull(firstParkLot.pick(token));
        assertThat(secondParkLot.pick(token), sameInstance(car));
    }

    @Test
    public void should_park_the_car_to_parking_lot_which_empty_lot_is_most() throws Exception {
        ParkingLot firstParkingLot = new ParkingLot(1);
        firstParkingLot.park(new Car());
        ParkingLot secondParkingLot = new ParkingLot(1);
        SmartBoy smartBoy = new SmartBoy(Lists.newArrayList(firstParkingLot, secondParkingLot));
        Car car = new Car();

        String token = smartBoy.park(car);

        assertThat(secondParkingLot.pick(token), sameInstance(car));
    }
}
