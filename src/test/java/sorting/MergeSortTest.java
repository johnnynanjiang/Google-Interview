package sorting;

import fixture.Fixtures;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import util.ArrayHelper;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by nanjiang on 17/11/17.
 */
public class MergeSortTest {
    int[] arrayToSort = new int[Fixtures.ARRAY_TO_SORT.length];

    @Before
    public void setUp() {
        System.arraycopy(
                Fixtures.ARRAY_TO_SORT, 0, arrayToSort, 0,
                Fixtures.ARRAY_TO_SORT.length
        );
    }

    @Test
    public void testMergeSortUp() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_UP,
                Arrays.toString(MergeSort.sortUp(arrayToSort))
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
        Range range0 = new Range(0, 2);
        Range range1 = new Range(3, 6);

        Range range = MergeSort.conquer(arrayToSort, range0, range1);

        assertEquals(0, range.start);
        assertEquals(6, range.end);

        assertEquals(
                Fixtures.RESULT_OF_SORT_UP,
                Arrays.toString(arrayToSort)
        );
    }
}