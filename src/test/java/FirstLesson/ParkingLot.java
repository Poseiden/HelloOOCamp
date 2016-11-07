package FirstLesson;

public class ParkingLot {
    private Car car;

    public void park(Car car) {
        this.car = car;
    }

    public Car pick() {
        return this.car;
    }

    public ParkingLot(Car car) {
        this.car = car;
    }

    public ParkingLot() {
    }
}
