package eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarRental {

    private final Agency[] agencies;

    public CarRental(Agency... agencies){
        this.agencies = agencies;
    }

    public Car findCheapestCar(int amountSeats, String type){
        Optional<Car> cheapestCar = Arrays.stream(agencies)
                .map(agency -> agency.findCar(amountSeats,type))
                .flatMap(List::stream)
                .min(Comparator.comparing(Car::getCostPerDay));

        return cheapestCar.orElse(null);

    }
}
