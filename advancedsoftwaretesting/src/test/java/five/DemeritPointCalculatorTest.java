package five;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DemeritPointCalculatorTest {

    private DemeritPointCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DemeritPointCalculator();
    }

        @ParameterizedTest
        @ValueSource (ints ={-10,400,301,-1})
        public void testCalculateDemeritPointsWhenCalledWhitUnacceptedSpeedThrowsException(int speed){
            IllegalArgumentException exception=
                    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> calculator.calculate(speed));
            assertEquals("Speed can not be bigger than 300, less than 0", exception.getMessage());
        }
    }


