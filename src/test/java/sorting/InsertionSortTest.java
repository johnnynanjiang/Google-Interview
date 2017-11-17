package sorting;

import fixture.Fixtures;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSortTest {
    @Test
    public void testInsertionSortUp() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_UP,
                Arrays.toString(InsertionSort.sortUp(Fixtures.ARRAY_TO_SORT))
        );
    }

    @Test
    public void testInsertionSortDown() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_DOWN,
                Arrays.toString(InsertionSort.sortDown(Fixtures.ARRAY_TO_SORT))
        );
    }
}
