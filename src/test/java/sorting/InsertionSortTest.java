package sorting;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSortTest {
    @Test
    public void testInsertionSortUp() {
        int[] array = {5, 4, 6, 7, 1, 2, 3};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(InsertionSort.sortUp(array))
        );
    }

    @Test
    public void testInsertionSortDown() {
        int[] array = {5, 4, 6, 7, 1, 2, 3};

        assertEquals(
                "[7, 6, 5, 4, 3, 2, 1]",
                Arrays.toString(InsertionSort.sortDown(array))
        );
    }
}
