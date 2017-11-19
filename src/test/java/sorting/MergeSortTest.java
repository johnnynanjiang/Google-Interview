package sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by nanjiang on 17/11/17.
 */
public class MergeSortTest {
    @Test
    public void testMergeSortUp() {
        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(MergeSort.sortUp(new int[]{5, 4, 6, 7, 1, 2, 3}))
        );
    }

    @Test
    public void testDivideRange() {
        Range range = new Range(0, 5);

        Range[] ranges = MergeSort.divide(range);

        assertEquals(0, ranges[0].start);
        assertEquals(2, ranges[0].end);
        assertEquals(3, ranges[1].start);
        assertEquals(5, ranges[1].end);
    }

    @Test
    public void testDivideRangeWithOnly2Elements() {
        Range range = new Range(2, 3);

        Range[] ranges = MergeSort.divide(range);

        assertEquals(2, ranges[0].start);
        assertEquals(2, ranges[0].end);
        assertEquals(3, ranges[1].start);
        assertEquals(3, ranges[1].end);
    }

    @Test
    public void testDivideRangeWithOnly1Element() {
        Range range = new Range(0, 0);

        Range[] ranges = MergeSort.divide(range);

        assertNull(ranges);
    }

    @Test
    public void testConquer() {
        int[] arrayToSort = {5, 6, 7, 1, 2, 3, 4};

        Range range0 = new Range(0, 2);
        Range range1 = new Range(3, 6);

        Range range = MergeSort.conquer(arrayToSort, range0, range1);

        assertEquals(0, range.start);
        assertEquals(6, range.end);

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(arrayToSort)
        );
    }
}