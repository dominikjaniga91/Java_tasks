package fibonacci;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test
    public void generate_returnSequenceOfNumber_givenNumberOfElements() {
        //given
        Fibonacci fibonacci = new Fibonacci();
        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21";
        //when
        String actual = fibonacci.generate(9);

        //then
        Assert.assertEquals(actual, expected);
    }
}
