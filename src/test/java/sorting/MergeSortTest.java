package sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeSortTest {

    @Test
    public void positiveTest() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        Assert.assertEquals(expected, actual);
    }
}
