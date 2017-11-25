package io.github.johnnynanjiang.google_interview.sorting;

import io.github.johnnynanjiang.google_interview.util.BaseTest;
import io.github.johnnynanjiang.google_interview.util.Comparator;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 25/11/17.
 */

public class QuickSortTest extends BaseTest {
    @Autowired
    QuickSort quickSort;

    @Test
    public void testSortUp() throws Exception {
        int[] arrayToSort = new int[] {7, 6 , 5, 4, 3, 1, 2};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }
}