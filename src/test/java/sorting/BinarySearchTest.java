package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 16/11/17.
 */
public class BinarySearchTest {
    @Test
    public void testBinarySearch() {
        Integer[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer key = 4;

        int result = BinarySearch.search(sortedArray, key);

        assertEquals(3, result);
    }
}