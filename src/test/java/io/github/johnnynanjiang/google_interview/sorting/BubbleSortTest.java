package io.github.johnnynanjiang.google_interview.sorting;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import io.github.johnnynanjiang.google_interview.util.BaseTest;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 17/11/17.
 */
public class BubbleSortTest extends BaseTest {
    @Autowired
    BubbleSort bubbleSort;

    @Test
    public void testBubbleSortUp() {
        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(bubbleSort.sortUp(new int[]{5, 4, 6, 7, 1, 2, 3}))
        );
    }
}