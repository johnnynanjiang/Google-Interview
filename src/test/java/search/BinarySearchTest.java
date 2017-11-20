package search;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import util.BaseTest;

import static org.junit.Assert.assertEquals;

/**
 * Created by nanjiang on 16/11/17.
 */
public class BinarySearchTest extends BaseTest {
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void testBinarySearch() {
        Integer[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer key = 4;

        int result = binarySearch.search(sortedArray, key);

        assertEquals(3, result);
    }
}