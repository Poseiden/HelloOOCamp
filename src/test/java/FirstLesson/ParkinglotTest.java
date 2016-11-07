package FirstLesson;

import org.junit.Test;

import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertThat;

public class ParkingLotTest {

    @Test
    public void should_be_able_to_pick_the_car_after_parking_it() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();

        parkingLot.park(car);

        assertThat(car, sameInstance(parkingLot.pick()));
    }

    @Test
    public void should_pick_the_car_when_park_it_into_the_parking_lot_with_a_car() throws Exception {
        ParkingLot parkingLot = new ParkingLot(new Car());
        Car car = new Car();

        parkingLot.park(car);

        assertThat(car, sameInstance(parkingLot.pick()));
    }

    @Test
    public void should_pick_the_correct_car_after_parking_it_into_parking_lot_with_multi_cars() throws Exception {
//        ParkingLot parkinglot
    }
}
