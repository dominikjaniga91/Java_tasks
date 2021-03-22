package sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickSortTest {

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        new QuickSort().sort(actual, 0, actual.length-1);
        Assert.assertEquals(expected, actual);
    }
}
