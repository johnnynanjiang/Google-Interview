package sorting;

import org.junit.Test;
import util.BaseTest;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSortTest extends BaseTest {
    @Test
    public void testInsertionSortUp() {
        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(InsertionSort.sortUp(new int[] {5, 4, 6, 7, 1, 2, 3}))
        );
    }

    @Test
    public void testInsertionSortDown() {
        assertEquals(
                "[7, 6, 5, 4, 3, 2, 1]",
                Arrays.toString(InsertionSort.sortDown(new int[] {5, 4, 6, 7, 1, 2, 3}))
        );
    }
}
