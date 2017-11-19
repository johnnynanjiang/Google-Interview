package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 19/11/17.
 */
public class SelectionSortTest {
    @Test
    public void testSortUp() {
        int[] arrayToSort = new int[] {7, 6 , 5, 4, 3, 1, 2};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(SelectionSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testSortDown() {
        int[] arrayToSort = new int[] {7, 6 , 5, 4, 3, 1, 2, 7, 0, -1};

        assertEquals(
                "[7, 7, 6, 5, 4, 3, 2, 1, 0, -1]",
                Arrays.toString(SelectionSort.sortDown(arrayToSort))
        );
    }
}