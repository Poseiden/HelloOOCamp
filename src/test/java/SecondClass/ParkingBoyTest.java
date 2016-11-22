package SecondClass;

import FirstLesson.Car;
import FirstLesson.ParkingLot;
import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertThat;

public class ParkingBoyTest {

    @Test
    public void should_pick_car_successful_when_parking_boy_park_it() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();

        String token = parkingBoy.park(car, parkingLot);

        assertThat(parkingLot.pick(token), sameInstance(car));
    }

    @Test
    public void should_parking_boy_pick_car_successfully_when_park_it() throws Exception {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy();

        String token  = parkingLot.park(car);

        assertThat(parkingBoy.pick(token, parkingLot), sameInstance(car));
    }
}
