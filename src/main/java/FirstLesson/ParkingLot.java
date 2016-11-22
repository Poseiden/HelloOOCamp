package FirstLesson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private Map<String, Car> carList = new HashMap<>();
    private int capability = 0;

    public ParkingLot(int capability) {
        this.capability = capability;
    }

    public String park(Car car) {
        if(carList.size() >= capability) {
            return null;
        }
        String token = UUID.randomUUID().toString();
        carList.put(token, car);
        return token;
    }

    public Car pick(String token) {
        return carList.remove(token);
    }

}
