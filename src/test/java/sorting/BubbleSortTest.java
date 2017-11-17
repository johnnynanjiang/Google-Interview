package sorting;

import fixture.Fixtures;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 17/11/17.
 */
public class BubbleSortTest {
    @Test
    public void testBubbleSortUp() {
        assertEquals(
                Fixtures.RESULT_OF_SORT_UP,
                Arrays.toString(BubbleSort.sortUp(Fixtures.ARRAY_TO_SORT))
        );
    }
}