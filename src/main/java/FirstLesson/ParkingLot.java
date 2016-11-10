package FirstLesson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private Map<String, Car> carList = new HashMap<>();

    public String park(Car car) {
        String token = UUID.randomUUID().toString();
        carList.put(token, car);
        return token;
    }

    public Car pick(String token) {
        return carList.remove(token);
    }

    public ParkingLot() {
        if(carList == null) {
            carList = new HashMap<>();
        }
    }
}
