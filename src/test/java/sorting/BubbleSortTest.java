package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 17/11/17.
 */
public class BubbleSortTest {
    final int[] array = {5, 4, 6, 7, 1, 2, 3};

    @Test
    public void testBubbleSortUp() {
        assertEquals("[1, 2, 3, 4, 5, 6, 7]", Arrays.toString(BubbleSort.sortUp(array)));
    }
}