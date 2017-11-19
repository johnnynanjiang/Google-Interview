package sorting;

import fixture.Fixtures;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSortTest {
    int[] arrayToSort = new int[Fixtures.ARRAY_TO_SORT.length];

    @Before
    public void setUp() {
        System.arraycopy(
                Fixtures.ARRAY_TO_SORT, 0, arrayToSort, 0,
                Fixtures.ARRAY_TO_SORT.length
        );
    }

    @Test
    public void testInsertionSortUp() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_UP,
                Arrays.toString(InsertionSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testInsertionSortDown() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_DOWN,
                Arrays.toString(InsertionSort.sortDown(arrayToSort))
        );
    }
}
