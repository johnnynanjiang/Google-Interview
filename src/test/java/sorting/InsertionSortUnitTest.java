package sorting;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSortUnitTest {
    @Test
    public void testInsertionSort() {
        int[] array = {5, 4, 6, 7, 1, 2, 3};

        int[] result = InsertionSort.sort(array);

        assertEquals("[1, 2, 3, 4, 5, 6, 7]", Arrays.toString(result));
    }
}
