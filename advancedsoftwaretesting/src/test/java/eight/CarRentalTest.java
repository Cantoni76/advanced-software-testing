package eight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CarRentalTest {

    @Mock
    Agency agencyMock;

    private CarRental carRental;

    @BeforeEach
    public void setup(){
        carRental = new CarRental(agencyMock);
    }

    @Test
    public void whenFindCarWithSetupReturnsSome(){
        Car cheapestCar = new Car("Ford", "Focus", 2.0,4, "sedan", 100);
        List<Car> cars = new ArrayList<>();
        cars.add(cheapestCar);

        when(agencyMock.findCar(5,"sedan"))
                .thenReturn(cars);

        Car result = carRental.findCheapestCar(5,"sedan");

        assertEquals(result, cheapestCar);
    }

}
