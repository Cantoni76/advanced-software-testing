package four;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.*;


class FizzbuzzTest {

    private Fizzbuzz fizzbuzz;


    @BeforeEach
    public void setup() {
        fizzbuzz = new Fizzbuzz();
    }

    @ParameterizedTest
    @MethodSource("getParameters")
    public void testPrintWhenArgumentGivenreturnTheOutput(int input, String expectedresult) {
        String result = fizzbuzz.print(input);
        assertEquals(expectedresult, result);
    }

    private static Stream<Arguments> getParameters() {
      return Stream.of(Arguments.of(1, "1"),
                Arguments.of(3, "Fizz"));
    }

}




