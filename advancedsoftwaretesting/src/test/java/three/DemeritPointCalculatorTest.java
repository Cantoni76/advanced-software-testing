package three;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DemeritPointCalculatorTest {

    @Test
    public void TestCalculateDemeritPointsWhenSpeedIsLessThan65_Return0(){
        DemeritPointCalculator calculator = new DemeritPointCalculator();
        double points = calculator.calculate(60.0);
        assertEquals(0,points);
    }

    @ParameterizedTest
    @CsvSource({"60,0", "65,0", "64,0", "70,1", "75,2"})
    public void TestCalculateDemeritPointsWhenCalled_ReturnPoints(int speed, double expectedResult){
        DemeritPointCalculator calculator = new DemeritPointCalculator();
        double points = calculator.calculate(speed);
        assertEquals(expectedResult, points);
    }

}
